// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/cdpi/v1alpha/cdpi.proto

package com.aalyria.spacetime.api.cdpi.v1alpha;

/**
 * Protobuf type {@code aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse}
 */
public final class CdpiResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse)
    CdpiResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CdpiResponse.newBuilder() to construct.
  private CdpiResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CdpiResponse() {
    requestPayload_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CdpiResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aalyria.spacetime.api.cdpi.v1alpha.CdpiProto.internal_static_aalyria_spacetime_api_cdpi_v1alpha_CdpiResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aalyria.spacetime.api.cdpi.v1alpha.CdpiProto.internal_static_aalyria_spacetime_api_cdpi_v1alpha_CdpiResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse.class, com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse.Builder.class);
  }

  private int bitField0_;
  public static final int REQUEST_ID_FIELD_NUMBER = 1;
  private long requestId_ = 0L;
  /**
   * <code>optional int64 request_id = 1 [json_name = "requestId"];</code>
   * @return Whether the requestId field is set.
   */
  @java.lang.Override
  public boolean hasRequestId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int64 request_id = 1 [json_name = "requestId"];</code>
   * @return The requestId.
   */
  @java.lang.Override
  public long getRequestId() {
    return requestId_;
  }

  public static final int REQUEST_PAYLOAD_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString requestPayload_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>optional bytes request_payload = 2 [json_name = "requestPayload"];</code>
   * @return Whether the requestPayload field is set.
   */
  @java.lang.Override
  public boolean hasRequestPayload() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional bytes request_payload = 2 [json_name = "requestPayload"];</code>
   * @return The requestPayload.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRequestPayload() {
    return requestPayload_;
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
      output.writeInt64(1, requestId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBytes(2, requestPayload_);
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
        .computeInt64Size(1, requestId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, requestPayload_);
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
    if (!(obj instanceof com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse)) {
      return super.equals(obj);
    }
    com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse other = (com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse) obj;

    if (hasRequestId() != other.hasRequestId()) return false;
    if (hasRequestId()) {
      if (getRequestId()
          != other.getRequestId()) return false;
    }
    if (hasRequestPayload() != other.hasRequestPayload()) return false;
    if (hasRequestPayload()) {
      if (!getRequestPayload()
          .equals(other.getRequestPayload())) return false;
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
    if (hasRequestId()) {
      hash = (37 * hash) + REQUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getRequestId());
    }
    if (hasRequestPayload()) {
      hash = (37 * hash) + REQUEST_PAYLOAD_FIELD_NUMBER;
      hash = (53 * hash) + getRequestPayload().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse parseFrom(
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
  public static Builder newBuilder(com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse prototype) {
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
   * Protobuf type {@code aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse)
      com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aalyria.spacetime.api.cdpi.v1alpha.CdpiProto.internal_static_aalyria_spacetime_api_cdpi_v1alpha_CdpiResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aalyria.spacetime.api.cdpi.v1alpha.CdpiProto.internal_static_aalyria_spacetime_api_cdpi_v1alpha_CdpiResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse.class, com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse.Builder.class);
    }

    // Construct using com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse.newBuilder()
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
      requestId_ = 0L;
      requestPayload_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aalyria.spacetime.api.cdpi.v1alpha.CdpiProto.internal_static_aalyria_spacetime_api_cdpi_v1alpha_CdpiResponse_descriptor;
    }

    @java.lang.Override
    public com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse getDefaultInstanceForType() {
      return com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse build() {
      com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse buildPartial() {
      com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse result = new com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.requestId_ = requestId_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.requestPayload_ = requestPayload_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse) {
        return mergeFrom((com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse other) {
      if (other == com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse.getDefaultInstance()) return this;
      if (other.hasRequestId()) {
        setRequestId(other.getRequestId());
      }
      if (other.hasRequestPayload()) {
        setRequestPayload(other.getRequestPayload());
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
              requestId_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              requestPayload_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private long requestId_ ;
    /**
     * <code>optional int64 request_id = 1 [json_name = "requestId"];</code>
     * @return Whether the requestId field is set.
     */
    @java.lang.Override
    public boolean hasRequestId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int64 request_id = 1 [json_name = "requestId"];</code>
     * @return The requestId.
     */
    @java.lang.Override
    public long getRequestId() {
      return requestId_;
    }
    /**
     * <code>optional int64 request_id = 1 [json_name = "requestId"];</code>
     * @param value The requestId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestId(long value) {

      requestId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 request_id = 1 [json_name = "requestId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRequestId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      requestId_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString requestPayload_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes request_payload = 2 [json_name = "requestPayload"];</code>
     * @return Whether the requestPayload field is set.
     */
    @java.lang.Override
    public boolean hasRequestPayload() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional bytes request_payload = 2 [json_name = "requestPayload"];</code>
     * @return The requestPayload.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getRequestPayload() {
      return requestPayload_;
    }
    /**
     * <code>optional bytes request_payload = 2 [json_name = "requestPayload"];</code>
     * @param value The requestPayload to set.
     * @return This builder for chaining.
     */
    public Builder setRequestPayload(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      requestPayload_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes request_payload = 2 [json_name = "requestPayload"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRequestPayload() {
      bitField0_ = (bitField0_ & ~0x00000002);
      requestPayload_ = getDefaultInstance().getRequestPayload();
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


    // @@protoc_insertion_point(builder_scope:aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse)
  }

  // @@protoc_insertion_point(class_scope:aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse)
  private static final com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse();
  }

  public static com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<CdpiResponse>
      PARSER = new com.google.protobuf.AbstractParser<CdpiResponse>() {
    @java.lang.Override
    public CdpiResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CdpiResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CdpiResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

