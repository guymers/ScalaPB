import sbt._
import sbt.internal.inc.ScalaInstance
import Keys._
import Dependencies.versions
import sbtprotoc.ProtocPlugin.autoImport.PB
import sbtassembly.AssemblyPlugin.autoImport._

object BuildHelper {
  val commonScalacOptions = Seq(
    "-deprecation",
    "-release",
    "8",
    "-feature",
    "-unchecked"
  )

  def isScala3 = Def.setting[Boolean] { scalaVersion.value.startsWith("3.") }

  def commonSettings = Seq(
    scalacOptions ++= commonScalacOptions,
    scalacOptions ++= (CrossVersion.partialVersion(scalaVersion.value) match {
      case Some((2, _)) =>
        Seq(
          "-explaintypes",
          "-Xfatal-warnings",
          "-Xlint:_",
          "-Ywarn-dead-code",
          "-Ywarn-extra-implicit",
          "-Ywarn-numeric-widen",
          "-Ywarn-unused:-nowarn", // include nowarn when no longer supporting Scala 2.12
          "-Ywarn-value-discard"
        )
      case Some((3, _)) =>
        Seq(
          "-language:implicitConversions",
          "-source:3.0-migration",
          "-Wunused:all",
          "-Wvalue-discard"
        )
      case _ => Seq.empty
    }),
    // not usable when using a testing framework that asserts by throwing
    Test / scalacOptions --= Seq(
      "-Ywarn-value-discard",
      "-Wvalue-discard"
    ),
    libraryDependencies += Dependencies.scalaCollectionCompat.value,
    assembly / assemblyMergeStrategy := {
      case PathList("scala", "annotation", "nowarn.class" | "nowarn$.class") =>
        MergeStrategy.first
      case x =>
        (assembly / assemblyMergeStrategy).value.apply(x)
    },
    compileOrder  := CompileOrder.JavaThenScala,
    versionScheme := Some("early-semver")
  )

  object Compiler {
    val generateVersionFile = Compile / sourceGenerators += Def.task {
      val file = (Compile / sourceManaged).value / "scalapb" / "compiler" / "Version.scala"
      IO.write(
        file,
        s"""package scalapb.compiler
           |object Version {
           |  val scalapbVersion = "${version.value}"
           |  val protobufVersion = "${versions.protobuf}"
           |  val grpcJavaVersion = "${versions.grpc}"
           |}""".stripMargin
      )
      Seq(file)
    }

    val generateEncodingFile = Compile / sourceGenerators += Def.task {
      val src =
        (LocalRootProject / baseDirectory).value / "scalapb-runtime" / "src" / "main" / "scala" / "scalapb" / "Encoding.scala"
      val dest =
        (Compile / sourceManaged).value / "scalapb" / "compiler" / "internal" / "Encoding.scala"
      val s = IO.read(src).replace("package scalapb", "package scalapb.internal")
      IO.write(dest, s"// DO NOT EDIT. Copy of $src\n\n" + s)
      Seq(dest)
    }

    val shadeTarget = settingKey[String]("Target to use when shading")
  }

  val scalajsSourceMaps = scalacOptions += {
    val a = (LocalRootProject / baseDirectory).value.toURI.toString
    val g = "https://raw.githubusercontent.com/scalapb/ScalaPB/" + sys.process
      .Process("git rev-parse HEAD")
      .lineStream_!
      .head
    val flag = if (isScala3.value) "-scalajs-mapSourceURI" else "-P:scalajs:mapSourceURI"
    s"$flag:$a->$g/"
  }
}
