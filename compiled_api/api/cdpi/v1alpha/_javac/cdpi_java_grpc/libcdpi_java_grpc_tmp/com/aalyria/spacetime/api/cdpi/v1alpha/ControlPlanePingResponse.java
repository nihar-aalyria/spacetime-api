// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/cdpi/v1alpha/cdpi.proto

package com.aalyria.spacetime.api.cdpi.v1alpha;

/**
 * Protobuf type {@code aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse}
 */
public final class ControlPlanePingResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse)
    ControlPlanePingResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ControlPlanePingResponse.newBuilder() to construct.
  private ControlPlanePingResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ControlPlanePingResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ControlPlanePingResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aalyria.spacetime.api.cdpi.v1alpha.CdpiProto.internal_static_aalyria_spacetime_api_cdpi_v1alpha_ControlPlanePingResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aalyria.spacetime.api.cdpi.v1alpha.CdpiProto.internal_static_aalyria_spacetime_api_cdpi_v1alpha_ControlPlanePingResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse.class, com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse.Builder.class);
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

  public static final int STATUS_FIELD_NUMBER = 3;
  private com.google.rpc.Status status_;
  /**
   * <code>optional .google.rpc.Status status = 3 [json_name = "status"];</code>
   * @return Whether the status field is set.
   */
  @java.lang.Override
  public boolean hasStatus() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .google.rpc.Status status = 3 [json_name = "status"];</code>
   * @return The status.
   */
  @java.lang.Override
  public com.google.rpc.Status getStatus() {
    return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
  }
  /**
   * <code>optional .google.rpc.Status status = 3 [json_name = "status"];</code>
   */
  @java.lang.Override
  public com.google.rpc.StatusOrBuilder getStatusOrBuilder() {
    return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
  }

  public static final int TIME_OF_RECEIPT_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp timeOfReceipt_;
  /**
   * <code>optional .google.protobuf.Timestamp time_of_receipt = 2 [json_name = "timeOfReceipt"];</code>
   * @return Whether the timeOfReceipt field is set.
   */
  @java.lang.Override
  public boolean hasTimeOfReceipt() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional .google.protobuf.Timestamp time_of_receipt = 2 [json_name = "timeOfReceipt"];</code>
   * @return The timeOfReceipt.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getTimeOfReceipt() {
    return timeOfReceipt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timeOfReceipt_;
  }
  /**
   * <code>optional .google.protobuf.Timestamp time_of_receipt = 2 [json_name = "timeOfReceipt"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getTimeOfReceiptOrBuilder() {
    return timeOfReceipt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timeOfReceipt_;
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
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeMessage(2, getTimeOfReceipt());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getStatus());
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
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTimeOfReceipt());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getStatus());
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
    if (!(obj instanceof com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse)) {
      return super.equals(obj);
    }
    com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse other = (com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (getId()
          != other.getId()) return false;
    }
    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
    }
    if (hasTimeOfReceipt() != other.hasTimeOfReceipt()) return false;
    if (hasTimeOfReceipt()) {
      if (!getTimeOfReceipt()
          .equals(other.getTimeOfReceipt())) return false;
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
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    if (hasTimeOfReceipt()) {
      hash = (37 * hash) + TIME_OF_RECEIPT_FIELD_NUMBER;
      hash = (53 * hash) + getTimeOfReceipt().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse parseFrom(
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
  public static Builder newBuilder(com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse prototype) {
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
   * Protobuf type {@code aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse)
      com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aalyria.spacetime.api.cdpi.v1alpha.CdpiProto.internal_static_aalyria_spacetime_api_cdpi_v1alpha_ControlPlanePingResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aalyria.spacetime.api.cdpi.v1alpha.CdpiProto.internal_static_aalyria_spacetime_api_cdpi_v1alpha_ControlPlanePingResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse.class, com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse.Builder.class);
    }

    // Construct using com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getStatusFieldBuilder();
        getTimeOfReceiptFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      id_ = 0L;
      status_ = null;
      if (statusBuilder_ != null) {
        statusBuilder_.dispose();
        statusBuilder_ = null;
      }
      timeOfReceipt_ = null;
      if (timeOfReceiptBuilder_ != null) {
        timeOfReceiptBuilder_.dispose();
        timeOfReceiptBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aalyria.spacetime.api.cdpi.v1alpha.CdpiProto.internal_static_aalyria_spacetime_api_cdpi_v1alpha_ControlPlanePingResponse_descriptor;
    }

    @java.lang.Override
    public com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse getDefaultInstanceForType() {
      return com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse build() {
      com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse buildPartial() {
      com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse result = new com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.status_ = statusBuilder_ == null
            ? status_
            : statusBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.timeOfReceipt_ = timeOfReceiptBuilder_ == null
            ? timeOfReceipt_
            : timeOfReceiptBuilder_.build();
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse) {
        return mergeFrom((com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse other) {
      if (other == com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse.getDefaultInstance()) return this;
      if (other.hasId()) {
        setId(other.getId());
      }
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      if (other.hasTimeOfReceipt()) {
        mergeTimeOfReceipt(other.getTimeOfReceipt());
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
            case 18: {
              input.readMessage(
                  getTimeOfReceiptFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getStatusFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 26
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

    private com.google.rpc.Status status_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder> statusBuilder_;
    /**
     * <code>optional .google.rpc.Status status = 3 [json_name = "status"];</code>
     * @return Whether the status field is set.
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .google.rpc.Status status = 3 [json_name = "status"];</code>
     * @return The status.
     */
    public com.google.rpc.Status getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.rpc.Status status = 3 [json_name = "status"];</code>
     */
    public Builder setStatus(com.google.rpc.Status value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
      } else {
        statusBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.rpc.Status status = 3 [json_name = "status"];</code>
     */
    public Builder setStatus(
        com.google.rpc.Status.Builder builderForValue) {
      if (statusBuilder_ == null) {
        status_ = builderForValue.build();
      } else {
        statusBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.rpc.Status status = 3 [json_name = "status"];</code>
     */
    public Builder mergeStatus(com.google.rpc.Status value) {
      if (statusBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          status_ != null &&
          status_ != com.google.rpc.Status.getDefaultInstance()) {
          getStatusBuilder().mergeFrom(value);
        } else {
          status_ = value;
        }
      } else {
        statusBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.rpc.Status status = 3 [json_name = "status"];</code>
     */
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000002);
      status_ = null;
      if (statusBuilder_ != null) {
        statusBuilder_.dispose();
        statusBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.rpc.Status status = 3 [json_name = "status"];</code>
     */
    public com.google.rpc.Status.Builder getStatusBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.rpc.Status status = 3 [json_name = "status"];</code>
     */
    public com.google.rpc.StatusOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ?
            com.google.rpc.Status.getDefaultInstance() : status_;
      }
    }
    /**
     * <code>optional .google.rpc.Status status = 3 [json_name = "status"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder> 
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>(
                getStatus(),
                getParentForChildren(),
                isClean());
        status_ = null;
      }
      return statusBuilder_;
    }

    private com.google.protobuf.Timestamp timeOfReceipt_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timeOfReceiptBuilder_;
    /**
     * <code>optional .google.protobuf.Timestamp time_of_receipt = 2 [json_name = "timeOfReceipt"];</code>
     * @return Whether the timeOfReceipt field is set.
     */
    public boolean hasTimeOfReceipt() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional .google.protobuf.Timestamp time_of_receipt = 2 [json_name = "timeOfReceipt"];</code>
     * @return The timeOfReceipt.
     */
    public com.google.protobuf.Timestamp getTimeOfReceipt() {
      if (timeOfReceiptBuilder_ == null) {
        return timeOfReceipt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timeOfReceipt_;
      } else {
        return timeOfReceiptBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.protobuf.Timestamp time_of_receipt = 2 [json_name = "timeOfReceipt"];</code>
     */
    public Builder setTimeOfReceipt(com.google.protobuf.Timestamp value) {
      if (timeOfReceiptBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timeOfReceipt_ = value;
      } else {
        timeOfReceiptBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp time_of_receipt = 2 [json_name = "timeOfReceipt"];</code>
     */
    public Builder setTimeOfReceipt(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (timeOfReceiptBuilder_ == null) {
        timeOfReceipt_ = builderForValue.build();
      } else {
        timeOfReceiptBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp time_of_receipt = 2 [json_name = "timeOfReceipt"];</code>
     */
    public Builder mergeTimeOfReceipt(com.google.protobuf.Timestamp value) {
      if (timeOfReceiptBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          timeOfReceipt_ != null &&
          timeOfReceipt_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getTimeOfReceiptBuilder().mergeFrom(value);
        } else {
          timeOfReceipt_ = value;
        }
      } else {
        timeOfReceiptBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp time_of_receipt = 2 [json_name = "timeOfReceipt"];</code>
     */
    public Builder clearTimeOfReceipt() {
      bitField0_ = (bitField0_ & ~0x00000004);
      timeOfReceipt_ = null;
      if (timeOfReceiptBuilder_ != null) {
        timeOfReceiptBuilder_.dispose();
        timeOfReceiptBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp time_of_receipt = 2 [json_name = "timeOfReceipt"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getTimeOfReceiptBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getTimeOfReceiptFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.protobuf.Timestamp time_of_receipt = 2 [json_name = "timeOfReceipt"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getTimeOfReceiptOrBuilder() {
      if (timeOfReceiptBuilder_ != null) {
        return timeOfReceiptBuilder_.getMessageOrBuilder();
      } else {
        return timeOfReceipt_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : timeOfReceipt_;
      }
    }
    /**
     * <code>optional .google.protobuf.Timestamp time_of_receipt = 2 [json_name = "timeOfReceipt"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getTimeOfReceiptFieldBuilder() {
      if (timeOfReceiptBuilder_ == null) {
        timeOfReceiptBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getTimeOfReceipt(),
                getParentForChildren(),
                isClean());
        timeOfReceipt_ = null;
      }
      return timeOfReceiptBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse)
  }

  // @@protoc_insertion_point(class_scope:aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse)
  private static final com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse();
  }

  public static com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<ControlPlanePingResponse>
      PARSER = new com.google.protobuf.AbstractParser<ControlPlanePingResponse>() {
    @java.lang.Override
    public ControlPlanePingResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ControlPlanePingResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ControlPlanePingResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
