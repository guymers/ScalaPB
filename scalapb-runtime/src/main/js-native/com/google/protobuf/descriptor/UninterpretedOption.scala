// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor

/** A message representing a option the parser does not recognize. This only
  * appears in options protos created by the compiler::Parser class.
  * DescriptorPool resolves these when building Descriptor objects. Therefore,
  * options protos in descriptor objects (e.g. returned by Descriptor::options(),
  * or produced by Descriptor::CopyTo()) will never have UninterpretedOptions
  * in them.
  *
  * @param identifierValue
  *   The value of the uninterpreted option, in whatever type the tokenizer
  *   identified it as during parsing. Exactly one of these should be set.
  */
@SerialVersionUID(0L)
final case class UninterpretedOption(
    name: _root_.scala.Seq[com.google.protobuf.descriptor.UninterpretedOption.NamePart] = _root_.scala.Seq.empty,
    identifierValue: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    positiveIntValue: _root_.scala.Option[_root_.scala.Long] = _root_.scala.None,
    negativeIntValue: _root_.scala.Option[_root_.scala.Long] = _root_.scala.None,
    doubleValue: _root_.scala.Option[_root_.scala.Double] = _root_.scala.None,
    stringValue: _root_.scala.Option[_root_.com.google.protobuf.ByteString] = _root_.scala.None,
    aggregateValue: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[UninterpretedOption] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      name.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      if (identifierValue.isDefined) {
        val __value = identifierValue.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
      };
      if (positiveIntValue.isDefined) {
        val __value = positiveIntValue.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt64Size(4, __value)
      };
      if (negativeIntValue.isDefined) {
        val __value = negativeIntValue.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeInt64Size(5, __value)
      };
      if (doubleValue.isDefined) {
        val __value = doubleValue.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeDoubleSize(6, __value)
      };
      if (stringValue.isDefined) {
        val __value = stringValue.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBytesSize(7, __value)
      };
      if (aggregateValue.isDefined) {
        val __value = aggregateValue.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(8, __value)
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var __size = __serializedSizeMemoized
      if (__size == 0) {
        __size = __computeSerializedSize() + 1
        __serializedSizeMemoized = __size
      }
      __size - 1
      
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      name.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      identifierValue.foreach { __v =>
        val __m = __v
        _output__.writeString(3, __m)
      };
      positiveIntValue.foreach { __v =>
        val __m = __v
        _output__.writeUInt64(4, __m)
      };
      negativeIntValue.foreach { __v =>
        val __m = __v
        _output__.writeInt64(5, __m)
      };
      doubleValue.foreach { __v =>
        val __m = __v
        _output__.writeDouble(6, __m)
      };
      stringValue.foreach { __v =>
        val __m = __v
        _output__.writeBytes(7, __m)
      };
      aggregateValue.foreach { __v =>
        val __m = __v
        _output__.writeString(8, __m)
      };
      unknownFields.writeTo(_output__)
    }
    def clearName = copy(name = _root_.scala.Seq.empty)
    def addName(__vs: com.google.protobuf.descriptor.UninterpretedOption.NamePart *): UninterpretedOption = addAllName(__vs)
    def addAllName(__vs: Iterable[com.google.protobuf.descriptor.UninterpretedOption.NamePart]): UninterpretedOption = copy(name = name ++ __vs)
    def withName(__v: _root_.scala.Seq[com.google.protobuf.descriptor.UninterpretedOption.NamePart]): UninterpretedOption = copy(name = __v)
    def getIdentifierValue: _root_.scala.Predef.String = identifierValue.getOrElse("")
    def clearIdentifierValue: UninterpretedOption = copy(identifierValue = _root_.scala.None)
    def withIdentifierValue(__v: _root_.scala.Predef.String): UninterpretedOption = copy(identifierValue = Option(__v))
    def getPositiveIntValue: _root_.scala.Long = positiveIntValue.getOrElse(0L)
    def clearPositiveIntValue: UninterpretedOption = copy(positiveIntValue = _root_.scala.None)
    def withPositiveIntValue(__v: _root_.scala.Long): UninterpretedOption = copy(positiveIntValue = Option(__v))
    def getNegativeIntValue: _root_.scala.Long = negativeIntValue.getOrElse(0L)
    def clearNegativeIntValue: UninterpretedOption = copy(negativeIntValue = _root_.scala.None)
    def withNegativeIntValue(__v: _root_.scala.Long): UninterpretedOption = copy(negativeIntValue = Option(__v))
    def getDoubleValue: _root_.scala.Double = doubleValue.getOrElse(0.0)
    def clearDoubleValue: UninterpretedOption = copy(doubleValue = _root_.scala.None)
    def withDoubleValue(__v: _root_.scala.Double): UninterpretedOption = copy(doubleValue = Option(__v))
    def getStringValue: _root_.com.google.protobuf.ByteString = stringValue.getOrElse(_root_.com.google.protobuf.ByteString.EMPTY)
    def clearStringValue: UninterpretedOption = copy(stringValue = _root_.scala.None)
    def withStringValue(__v: _root_.com.google.protobuf.ByteString): UninterpretedOption = copy(stringValue = Option(__v))
    def getAggregateValue: _root_.scala.Predef.String = aggregateValue.getOrElse("")
    def clearAggregateValue: UninterpretedOption = copy(aggregateValue = _root_.scala.None)
    def withAggregateValue(__v: _root_.scala.Predef.String): UninterpretedOption = copy(aggregateValue = Option(__v))
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 2 => name
        case 3 => identifierValue.orNull
        case 4 => positiveIntValue.orNull
        case 5 => negativeIntValue.orNull
        case 6 => doubleValue.orNull
        case 7 => stringValue.orNull
        case 8 => aggregateValue.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 2 => _root_.scalapb.descriptors.PRepeated(name.iterator.map(_.toPMessage).toVector)
        case 3 => identifierValue.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 4 => positiveIntValue.map(_root_.scalapb.descriptors.PLong(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 5 => negativeIntValue.map(_root_.scalapb.descriptors.PLong(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 6 => doubleValue.map(_root_.scalapb.descriptors.PDouble(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 7 => stringValue.map(_root_.scalapb.descriptors.PByteString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 8 => aggregateValue.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: com.google.protobuf.descriptor.UninterpretedOption.type = com.google.protobuf.descriptor.UninterpretedOption
    // @@protoc_insertion_point(GeneratedMessage[google.protobuf.UninterpretedOption])
}

object UninterpretedOption extends scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.UninterpretedOption] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.UninterpretedOption] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.UninterpretedOption = {
    val __name: _root_.scala.collection.immutable.VectorBuilder[com.google.protobuf.descriptor.UninterpretedOption.NamePart] = new _root_.scala.collection.immutable.VectorBuilder[com.google.protobuf.descriptor.UninterpretedOption.NamePart]
    var __identifierValue: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None
    var __positiveIntValue: _root_.scala.Option[_root_.scala.Long] = _root_.scala.None
    var __negativeIntValue: _root_.scala.Option[_root_.scala.Long] = _root_.scala.None
    var __doubleValue: _root_.scala.Option[_root_.scala.Double] = _root_.scala.None
    var __stringValue: _root_.scala.Option[_root_.com.google.protobuf.ByteString] = _root_.scala.None
    var __aggregateValue: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 18 =>
          __name += _root_.scalapb.LiteParser.readMessage[com.google.protobuf.descriptor.UninterpretedOption.NamePart](_input__)
        case 26 =>
          __identifierValue = _root_.scala.Option(_input__.readStringRequireUtf8())
        case 32 =>
          __positiveIntValue = _root_.scala.Option(_input__.readUInt64())
        case 40 =>
          __negativeIntValue = _root_.scala.Option(_input__.readInt64())
        case 49 =>
          __doubleValue = _root_.scala.Option(_input__.readDouble())
        case 58 =>
          __stringValue = _root_.scala.Option(_input__.readBytes())
        case 66 =>
          __aggregateValue = _root_.scala.Option(_input__.readStringRequireUtf8())
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    com.google.protobuf.descriptor.UninterpretedOption(
        name = __name.result(),
        identifierValue = __identifierValue,
        positiveIntValue = __positiveIntValue,
        negativeIntValue = __negativeIntValue,
        doubleValue = __doubleValue,
        stringValue = __stringValue,
        aggregateValue = __aggregateValue,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.descriptor.UninterpretedOption] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.descriptor.UninterpretedOption(
        name = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Seq[com.google.protobuf.descriptor.UninterpretedOption.NamePart]]).getOrElse(_root_.scala.Seq.empty),
        identifierValue = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        positiveIntValue = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Long]]),
        negativeIntValue = __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Long]]),
        doubleValue = __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Double]]),
        stringValue = __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).flatMap(_.as[_root_.scala.Option[_root_.com.google.protobuf.ByteString]]),
        aggregateValue = __fieldsMap.get(scalaDescriptor.findFieldByNumber(8).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.javaDescriptor.getMessageTypes().get(18)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DescriptorProtoCompanion.scalaDescriptor.messages(18)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = com.google.protobuf.descriptor.UninterpretedOption.NamePart
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      _root_.com.google.protobuf.descriptor.UninterpretedOption.NamePart
    )
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.descriptor.UninterpretedOption(
    name = _root_.scala.Seq.empty,
    identifierValue = _root_.scala.None,
    positiveIntValue = _root_.scala.None,
    negativeIntValue = _root_.scala.None,
    doubleValue = _root_.scala.None,
    stringValue = _root_.scala.None,
    aggregateValue = _root_.scala.None
  )
  /** The name of the uninterpreted option.  Each string represents a segment in
    * a dot-separated name.  is_extension is true iff a segment represents an
    * extension (denoted with parentheses in options specs in .proto files).
    * E.g.,{ ["foo", false], ["bar.baz", true], ["qux", false] } represents
    * "foo.(bar.baz).qux".
    */
  @SerialVersionUID(0L)
  final case class NamePart(
      namePart: _root_.scala.Predef.String,
      isExtension: _root_.scala.Boolean,
      unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
      ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[NamePart] {
      @transient
      private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
      private[this] def __computeSerializedSize(): _root_.scala.Int = {
        var __size = 0
        
        {
          val __value = namePart
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        };
        
        {
          val __value = isExtension
          __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(2, __value)
        };
        __size += unknownFields.serializedSize
        __size
      }
      override def serializedSize: _root_.scala.Int = {
        var __size = __serializedSizeMemoized
        if (__size == 0) {
          __size = __computeSerializedSize() + 1
          __serializedSizeMemoized = __size
        }
        __size - 1
        
      }
      def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
        
        {
          val __v = namePart
          _output__.writeString(1, __v)
        };
        
        {
          val __v = isExtension
          _output__.writeBool(2, __v)
        };
        unknownFields.writeTo(_output__)
      }
      def withNamePart(__v: _root_.scala.Predef.String): NamePart = copy(namePart = __v)
      def withIsExtension(__v: _root_.scala.Boolean): NamePart = copy(isExtension = __v)
      def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
      def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => namePart
          case 2 => isExtension
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PString(namePart)
          case 2 => _root_.scalapb.descriptors.PBoolean(isExtension)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion: com.google.protobuf.descriptor.UninterpretedOption.NamePart.type = com.google.protobuf.descriptor.UninterpretedOption.NamePart
      // @@protoc_insertion_point(GeneratedMessage[google.protobuf.UninterpretedOption.NamePart])
  }
  
  object NamePart extends scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.UninterpretedOption.NamePart] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.UninterpretedOption.NamePart] = this
    def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.UninterpretedOption.NamePart = {
      var __requiredFields0: _root_.scala.Long = 0x3L
      var __namePart: _root_.scala.Predef.String = ""
      var __isExtension: _root_.scala.Boolean = false
      var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __namePart = _input__.readStringRequireUtf8()
            __requiredFields0 &= 0xfffffffffffffffeL
          case 16 =>
            __isExtension = _input__.readBool()
            __requiredFields0 &= 0xfffffffffffffffdL
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      if (__requiredFields0 != 0L) { throw new _root_.com.google.protobuf.InvalidProtocolBufferException("Message missing required fields.") } 
      com.google.protobuf.descriptor.UninterpretedOption.NamePart(
          namePart = __namePart,
          isExtension = __isExtension,
          unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.descriptor.UninterpretedOption.NamePart] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
        com.google.protobuf.descriptor.UninterpretedOption.NamePart(
          namePart = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).get.as[_root_.scala.Predef.String],
          isExtension = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).get.as[_root_.scala.Boolean]
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = com.google.protobuf.descriptor.UninterpretedOption.javaDescriptor.getNestedTypes().get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = com.google.protobuf.descriptor.UninterpretedOption.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = com.google.protobuf.descriptor.UninterpretedOption.NamePart(
      namePart = "",
      isExtension = false
    )
    implicit class NamePartLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.UninterpretedOption.NamePart]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.UninterpretedOption.NamePart](_l) {
      def namePart: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.namePart)((c_, f_) => c_.copy(namePart = f_))
      def isExtension: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.isExtension)((c_, f_) => c_.copy(isExtension = f_))
    }
    final val NAME_PART_FIELD_NUMBER = 1
    final val IS_EXTENSION_FIELD_NUMBER = 2
    def of(
      namePart: _root_.scala.Predef.String,
      isExtension: _root_.scala.Boolean
    ): _root_.com.google.protobuf.descriptor.UninterpretedOption.NamePart = _root_.com.google.protobuf.descriptor.UninterpretedOption.NamePart(
      namePart,
      isExtension
    )
    // @@protoc_insertion_point(GeneratedMessageCompanion[google.protobuf.UninterpretedOption.NamePart])
  }
  
  implicit class UninterpretedOptionLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.UninterpretedOption]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.UninterpretedOption](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.protobuf.descriptor.UninterpretedOption.NamePart]] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def identifierValue: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getIdentifierValue)((c_, f_) => c_.copy(identifierValue = _root_.scala.Option(f_)))
    def optionalIdentifierValue: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.identifierValue)((c_, f_) => c_.copy(identifierValue = f_))
    def positiveIntValue: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Long] = field(_.getPositiveIntValue)((c_, f_) => c_.copy(positiveIntValue = _root_.scala.Option(f_)))
    def optionalPositiveIntValue: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Long]] = field(_.positiveIntValue)((c_, f_) => c_.copy(positiveIntValue = f_))
    def negativeIntValue: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Long] = field(_.getNegativeIntValue)((c_, f_) => c_.copy(negativeIntValue = _root_.scala.Option(f_)))
    def optionalNegativeIntValue: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Long]] = field(_.negativeIntValue)((c_, f_) => c_.copy(negativeIntValue = f_))
    def doubleValue: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Double] = field(_.getDoubleValue)((c_, f_) => c_.copy(doubleValue = _root_.scala.Option(f_)))
    def optionalDoubleValue: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Double]] = field(_.doubleValue)((c_, f_) => c_.copy(doubleValue = f_))
    def stringValue: _root_.scalapb.lenses.Lens[UpperPB, _root_.com.google.protobuf.ByteString] = field(_.getStringValue)((c_, f_) => c_.copy(stringValue = _root_.scala.Option(f_)))
    def optionalStringValue: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.com.google.protobuf.ByteString]] = field(_.stringValue)((c_, f_) => c_.copy(stringValue = f_))
    def aggregateValue: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getAggregateValue)((c_, f_) => c_.copy(aggregateValue = _root_.scala.Option(f_)))
    def optionalAggregateValue: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.aggregateValue)((c_, f_) => c_.copy(aggregateValue = f_))
  }
  final val NAME_FIELD_NUMBER = 2
  final val IDENTIFIER_VALUE_FIELD_NUMBER = 3
  final val POSITIVE_INT_VALUE_FIELD_NUMBER = 4
  final val NEGATIVE_INT_VALUE_FIELD_NUMBER = 5
  final val DOUBLE_VALUE_FIELD_NUMBER = 6
  final val STRING_VALUE_FIELD_NUMBER = 7
  final val AGGREGATE_VALUE_FIELD_NUMBER = 8
  def of(
    name: _root_.scala.Seq[com.google.protobuf.descriptor.UninterpretedOption.NamePart],
    identifierValue: _root_.scala.Option[_root_.scala.Predef.String],
    positiveIntValue: _root_.scala.Option[_root_.scala.Long],
    negativeIntValue: _root_.scala.Option[_root_.scala.Long],
    doubleValue: _root_.scala.Option[_root_.scala.Double],
    stringValue: _root_.scala.Option[_root_.com.google.protobuf.ByteString],
    aggregateValue: _root_.scala.Option[_root_.scala.Predef.String]
  ): _root_.com.google.protobuf.descriptor.UninterpretedOption = _root_.com.google.protobuf.descriptor.UninterpretedOption(
    name,
    identifierValue,
    positiveIntValue,
    negativeIntValue,
    doubleValue,
    stringValue,
    aggregateValue
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[google.protobuf.UninterpretedOption])
}
