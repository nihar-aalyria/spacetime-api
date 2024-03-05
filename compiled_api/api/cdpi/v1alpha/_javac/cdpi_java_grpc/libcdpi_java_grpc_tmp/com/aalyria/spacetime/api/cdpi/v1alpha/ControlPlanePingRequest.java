// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/cdpi/v1alpha/cdpi.proto

package com.aalyria.spacetime.api.cdpi.v1alpha;

/**
 * Protobuf type {@code aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest}
 */
public final class ControlPlanePingRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest)
    ControlPlanePingRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ControlPlanePingRequest.newBuilder() to construct.
  private ControlPlanePingRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ControlPlanePingRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ControlPlanePingRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aalyria.spacetime.api.cdpi.v1alpha.CdpiProto.internal_static_aalyria_spacetime_api_cdpi_v1alpha_ControlPlanePingRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aalyria.spacetime.api.cdpi.v1alpha.CdpiProto.internal_static_aalyria_spacetime_api_cdpi_v1alpha_ControlPlanePingRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest.class, com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  private long id_ = 0L;
  /**
   * <code>optional int64 id = 1 [json_name = "id"];</code>
   * @return Whether the id field is set.
   */
  @java.lang.Override
  public boolean hasId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int64 id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(1, id_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
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
    if (!(obj instanceof com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest)) {
      return super.equals(obj);
    }
    com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest other = (com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (getId()
          != other.getId()) return false;
    }
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
    if (hasId()) {
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getId());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest parseFrom(
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
  public static Builder newBuilder(com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest prototype) {
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
   * Protobuf type {@code aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest)
      com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aalyria.spacetime.api.cdpi.v1alpha.CdpiProto.internal_static_aalyria_spacetime_api_cdpi_v1alpha_ControlPlanePingRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aalyria.spacetime.api.cdpi.v1alpha.CdpiProto.internal_static_aalyria_spacetime_api_cdpi_v1alpha_ControlPlanePingRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest.class, com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest.Builder.class);
    }

    // Construct using com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest.newBuilder()
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
      id_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aalyria.spacetime.api.cdpi.v1alpha.CdpiProto.internal_static_aalyria_spacetime_api_cdpi_v1alpha_ControlPlanePingRequest_descriptor;
    }

    @java.lang.Override
    public com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest getDefaultInstanceForType() {
      return com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest build() {
      com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest buildPartial() {
      com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest result = new com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest) {
        return mergeFrom((com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest other) {
      if (other == com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest.getDefaultInstance()) return this;
      if (other.hasId()) {
        setId(other.getId());
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
              id_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private long id_ ;
    /**
     * <code>optional int64 id = 1 [json_name = "id"];</code>
     * @return Whether the id field is set.
     */
    @java.lang.Override
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int64 id = 1 [json_name = "id"];</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <code>optional int64 id = 1 [json_name = "id"];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {

      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 id = 1 [json_name = "id"];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest)
  }

  // @@protoc_insertion_point(class_scope:aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest)
  private static final com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest();
  }

  public static com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<ControlPlanePingRequest>
      PARSER = new com.google.protobuf.AbstractParser<ControlPlanePingRequest>() {
    @java.lang.Override
    public ControlPlanePingRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ControlPlanePingRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ControlPlanePingRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

