// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/type/fraction.proto

package com.google.type;

/**
 * <pre>
 * Represents a fraction in terms of a numerator divided by a denominator.
 * </pre>
 *
 * Protobuf type {@code google.type.Fraction}
 */
public final class Fraction extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.type.Fraction)
    FractionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Fraction.newBuilder() to construct.
  private Fraction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Fraction() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Fraction();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.type.FractionProto.internal_static_google_type_Fraction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.type.FractionProto.internal_static_google_type_Fraction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.type.Fraction.class, com.google.type.Fraction.Builder.class);
  }

  public static final int NUMERATOR_FIELD_NUMBER = 1;
  private long numerator_ = 0L;
  /**
   * <pre>
   * The numerator in the fraction, e.g. 2 in 2/3.
   * </pre>
   *
   * <code>int64 numerator = 1;</code>
   * @return The numerator.
   */
  @java.lang.Override
  public long getNumerator() {
    return numerator_;
  }

  public static final int DENOMINATOR_FIELD_NUMBER = 2;
  private long denominator_ = 0L;
  /**
   * <pre>
   * The value by which the numerator is divided, e.g. 3 in 2/3. Must be
   * positive.
   * </pre>
   *
   * <code>int64 denominator = 2;</code>
   * @return The denominator.
   */
  @java.lang.Override
  public long getDenominator() {
    return denominator_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (numerator_ != 0L) {
      output.writeInt64(1, numerator_);
    }
    if (denominator_ != 0L) {
      output.writeInt64(2, denominator_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (numerator_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, numerator_);
    }
    if (denominator_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, denominator_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.type.Fraction)) {
      return super.equals(obj);
    }
    com.google.type.Fraction other = (com.google.type.Fraction) obj;

    if (getNumerator()
        != other.getNumerator()) return false;
    if (getDenominator()
        != other.getDenominator()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NUMERATOR_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumerator());
    hash = (37 * hash) + DENOMINATOR_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDenominator());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.type.Fraction parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.type.Fraction parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.type.Fraction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.type.Fraction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.type.Fraction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.type.Fraction parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.type.Fraction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.type.Fraction parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.type.Fraction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.type.Fraction parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.type.Fraction parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.type.Fraction parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.type.Fraction prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Represents a fraction in terms of a numerator divided by a denominator.
   * </pre>
   *
   * Protobuf type {@code google.type.Fraction}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.type.Fraction)
      com.google.type.FractionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.type.FractionProto.internal_static_google_type_Fraction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.type.FractionProto.internal_static_google_type_Fraction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.type.Fraction.class, com.google.type.Fraction.Builder.class);
    }

    // Construct using com.google.type.Fraction.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      numerator_ = 0L;
      denominator_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.type.FractionProto.internal_static_google_type_Fraction_descriptor;
    }

    @java.lang.Override
    public com.google.type.Fraction getDefaultInstanceForType() {
      return com.google.type.Fraction.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.type.Fraction build() {
      com.google.type.Fraction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.type.Fraction buildPartial() {
      com.google.type.Fraction result = new com.google.type.Fraction(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.type.Fraction result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.numerator_ = numerator_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.denominator_ = denominator_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.type.Fraction) {
        return mergeFrom((com.google.type.Fraction)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.type.Fraction other) {
      if (other == com.google.type.Fraction.getDefaultInstance()) return this;
      if (other.getNumerator() != 0L) {
        setNumerator(other.getNumerator());
      }
      if (other.getDenominator() != 0L) {
        setDenominator(other.getDenominator());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              numerator_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              denominator_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private long numerator_ ;
    /**
     * <pre>
     * The numerator in the fraction, e.g. 2 in 2/3.
     * </pre>
     *
     * <code>int64 numerator = 1;</code>
     * @return The numerator.
     */
    @java.lang.Override
    public long getNumerator() {
      return numerator_;
    }
    /**
     * <pre>
     * The numerator in the fraction, e.g. 2 in 2/3.
     * </pre>
     *
     * <code>int64 numerator = 1;</code>
     * @param value The numerator to set.
     * @return This builder for chaining.
     */
    public Builder setNumerator(long value) {

      numerator_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The numerator in the fraction, e.g. 2 in 2/3.
     * </pre>
     *
     * <code>int64 numerator = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumerator() {
      bitField0_ = (bitField0_ & ~0x00000001);
      numerator_ = 0L;
      onChanged();
      return this;
    }

    private long denominator_ ;
    /**
     * <pre>
     * The value by which the numerator is divided, e.g. 3 in 2/3. Must be
     * positive.
     * </pre>
     *
     * <code>int64 denominator = 2;</code>
     * @return The denominator.
     */
    @java.lang.Override
    public long getDenominator() {
      return denominator_;
    }
    /**
     * <pre>
     * The value by which the numerator is divided, e.g. 3 in 2/3. Must be
     * positive.
     * </pre>
     *
     * <code>int64 denominator = 2;</code>
     * @param value The denominator to set.
     * @return This builder for chaining.
     */
    public Builder setDenominator(long value) {

      denominator_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The value by which the numerator is divided, e.g. 3 in 2/3. Must be
     * positive.
     * </pre>
     *
     * <code>int64 denominator = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDenominator() {
      bitField0_ = (bitField0_ & ~0x00000002);
      denominator_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.type.Fraction)
  }

  // @@protoc_insertion_point(class_scope:google.type.Fraction)
  private static final com.google.type.Fraction DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.type.Fraction();
  }

  public static com.google.type.Fraction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Fraction>
      PARSER = new com.google.protobuf.AbstractParser<Fraction>() {
    @java.lang.Override
    public Fraction parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Fraction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Fraction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.type.Fraction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

