// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/cdpi/v1alpha/cdpi.proto

package com.aalyria.spacetime.api.cdpi.v1alpha;

/**
 * Protobuf type {@code aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest}
 */
public final class CdpiNodeStateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest)
    CdpiNodeStateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CdpiNodeStateRequest.newBuilder() to construct.
  private CdpiNodeStateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CdpiNodeStateRequest() {
    nodeId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CdpiNodeStateRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aalyria.spacetime.api.cdpi.v1alpha.CdpiProto.internal_static_aalyria_spacetime_api_cdpi_v1alpha_CdpiNodeStateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aalyria.spacetime.api.cdpi.v1alpha.CdpiProto.internal_static_aalyria_spacetime_api_cdpi_v1alpha_CdpiNodeStateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest.class, com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest.Builder.class);
  }

  private int bitField0_;
  public static final int NODE_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nodeId_ = "";
  /**
   * <code>optional string node_id = 1 [json_name = "nodeId"];</code>
   * @return Whether the nodeId field is set.
   */
  @java.lang.Override
  public boolean hasNodeId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string node_id = 1 [json_name = "nodeId"];</code>
   * @return The nodeId.
   */
  @java.lang.Override
  public java.lang.String getNodeId() {
    java.lang.Object ref = nodeId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        nodeId_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string node_id = 1 [json_name = "nodeId"];</code>
   * @return The bytes for nodeId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNodeIdBytes() {
    java.lang.Object ref = nodeId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nodeId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATE_FIELD_NUMBER = 3;
  private com.aalyria.spacetime.api.common.Control.ControlPlaneState state_;
  /**
   * <code>optional .aalyria.spacetime.api.common.ControlPlaneState state = 3 [json_name = "state"];</code>
   * @return Whether the state field is set.
   */
  @java.lang.Override
  public boolean hasState() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .aalyria.spacetime.api.common.ControlPlaneState state = 3 [json_name = "state"];</code>
   * @return The state.
   */
  @java.lang.Override
  public com.aalyria.spacetime.api.common.Control.ControlPlaneState getState() {
    return state_ == null ? com.aalyria.spacetime.api.common.Control.ControlPlaneState.getDefaultInstance() : state_;
  }
  /**
   * <code>optional .aalyria.spacetime.api.common.ControlPlaneState state = 3 [json_name = "state"];</code>
   */
  @java.lang.Override
  public com.aalyria.spacetime.api.common.Control.ControlPlaneStateOrBuilder getStateOrBuilder() {
    return state_ == null ? com.aalyria.spacetime.api.common.Control.ControlPlaneState.getDefaultInstance() : state_;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, nodeId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getState());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, nodeId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getState());
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
    if (!(obj instanceof com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest)) {
      return super.equals(obj);
    }
    com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest other = (com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest) obj;

    if (hasNodeId() != other.hasNodeId()) return false;
    if (hasNodeId()) {
      if (!getNodeId()
          .equals(other.getNodeId())) return false;
    }
    if (hasState() != other.hasState()) return false;
    if (hasState()) {
      if (!getState()
          .equals(other.getState())) return false;
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
    if (hasNodeId()) {
      hash = (37 * hash) + NODE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getNodeId().hashCode();
    }
    if (hasState()) {
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + getState().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest parseFrom(
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
  public static Builder newBuilder(com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest prototype) {
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
   * Protobuf type {@code aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest)
      com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aalyria.spacetime.api.cdpi.v1alpha.CdpiProto.internal_static_aalyria_spacetime_api_cdpi_v1alpha_CdpiNodeStateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aalyria.spacetime.api.cdpi.v1alpha.CdpiProto.internal_static_aalyria_spacetime_api_cdpi_v1alpha_CdpiNodeStateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest.class, com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest.Builder.class);
    }

    // Construct using com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest.newBuilder()
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
        getStateFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      nodeId_ = "";
      state_ = null;
      if (stateBuilder_ != null) {
        stateBuilder_.dispose();
        stateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aalyria.spacetime.api.cdpi.v1alpha.CdpiProto.internal_static_aalyria_spacetime_api_cdpi_v1alpha_CdpiNodeStateRequest_descriptor;
    }

    @java.lang.Override
    public com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest getDefaultInstanceForType() {
      return com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest build() {
      com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest buildPartial() {
      com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest result = new com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.nodeId_ = nodeId_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.state_ = stateBuilder_ == null
            ? state_
            : stateBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest) {
        return mergeFrom((com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest other) {
      if (other == com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest.getDefaultInstance()) return this;
      if (other.hasNodeId()) {
        nodeId_ = other.nodeId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasState()) {
        mergeState(other.getState());
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
            case 10: {
              nodeId_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 26: {
              input.readMessage(
                  getStateFieldBuilder().getBuilder(),
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

    private java.lang.Object nodeId_ = "";
    /**
     * <code>optional string node_id = 1 [json_name = "nodeId"];</code>
     * @return Whether the nodeId field is set.
     */
    public boolean hasNodeId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string node_id = 1 [json_name = "nodeId"];</code>
     * @return The nodeId.
     */
    public java.lang.String getNodeId() {
      java.lang.Object ref = nodeId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          nodeId_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string node_id = 1 [json_name = "nodeId"];</code>
     * @return The bytes for nodeId.
     */
    public com.google.protobuf.ByteString
        getNodeIdBytes() {
      java.lang.Object ref = nodeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nodeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string node_id = 1 [json_name = "nodeId"];</code>
     * @param value The nodeId to set.
     * @return This builder for chaining.
     */
    public Builder setNodeId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nodeId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional string node_id = 1 [json_name = "nodeId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNodeId() {
      nodeId_ = getDefaultInstance().getNodeId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>optional string node_id = 1 [json_name = "nodeId"];</code>
     * @param value The bytes for nodeId to set.
     * @return This builder for chaining.
     */
    public Builder setNodeIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      nodeId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.aalyria.spacetime.api.common.Control.ControlPlaneState state_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aalyria.spacetime.api.common.Control.ControlPlaneState, com.aalyria.spacetime.api.common.Control.ControlPlaneState.Builder, com.aalyria.spacetime.api.common.Control.ControlPlaneStateOrBuilder> stateBuilder_;
    /**
     * <code>optional .aalyria.spacetime.api.common.ControlPlaneState state = 3 [json_name = "state"];</code>
     * @return Whether the state field is set.
     */
    public boolean hasState() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .aalyria.spacetime.api.common.ControlPlaneState state = 3 [json_name = "state"];</code>
     * @return The state.
     */
    public com.aalyria.spacetime.api.common.Control.ControlPlaneState getState() {
      if (stateBuilder_ == null) {
        return state_ == null ? com.aalyria.spacetime.api.common.Control.ControlPlaneState.getDefaultInstance() : state_;
      } else {
        return stateBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .aalyria.spacetime.api.common.ControlPlaneState state = 3 [json_name = "state"];</code>
     */
    public Builder setState(com.aalyria.spacetime.api.common.Control.ControlPlaneState value) {
      if (stateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        state_ = value;
      } else {
        stateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .aalyria.spacetime.api.common.ControlPlaneState state = 3 [json_name = "state"];</code>
     */
    public Builder setState(
        com.aalyria.spacetime.api.common.Control.ControlPlaneState.Builder builderForValue) {
      if (stateBuilder_ == null) {
        state_ = builderForValue.build();
      } else {
        stateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .aalyria.spacetime.api.common.ControlPlaneState state = 3 [json_name = "state"];</code>
     */
    public Builder mergeState(com.aalyria.spacetime.api.common.Control.ControlPlaneState value) {
      if (stateBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          state_ != null &&
          state_ != com.aalyria.spacetime.api.common.Control.ControlPlaneState.getDefaultInstance()) {
          getStateBuilder().mergeFrom(value);
        } else {
          state_ = value;
        }
      } else {
        stateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .aalyria.spacetime.api.common.ControlPlaneState state = 3 [json_name = "state"];</code>
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000002);
      state_ = null;
      if (stateBuilder_ != null) {
        stateBuilder_.dispose();
        stateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .aalyria.spacetime.api.common.ControlPlaneState state = 3 [json_name = "state"];</code>
     */
    public com.aalyria.spacetime.api.common.Control.ControlPlaneState.Builder getStateBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getStateFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .aalyria.spacetime.api.common.ControlPlaneState state = 3 [json_name = "state"];</code>
     */
    public com.aalyria.spacetime.api.common.Control.ControlPlaneStateOrBuilder getStateOrBuilder() {
      if (stateBuilder_ != null) {
        return stateBuilder_.getMessageOrBuilder();
      } else {
        return state_ == null ?
            com.aalyria.spacetime.api.common.Control.ControlPlaneState.getDefaultInstance() : state_;
      }
    }
    /**
     * <code>optional .aalyria.spacetime.api.common.ControlPlaneState state = 3 [json_name = "state"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aalyria.spacetime.api.common.Control.ControlPlaneState, com.aalyria.spacetime.api.common.Control.ControlPlaneState.Builder, com.aalyria.spacetime.api.common.Control.ControlPlaneStateOrBuilder> 
        getStateFieldBuilder() {
      if (stateBuilder_ == null) {
        stateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aalyria.spacetime.api.common.Control.ControlPlaneState, com.aalyria.spacetime.api.common.Control.ControlPlaneState.Builder, com.aalyria.spacetime.api.common.Control.ControlPlaneStateOrBuilder>(
                getState(),
                getParentForChildren(),
                isClean());
        state_ = null;
      }
      return stateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest)
  }

  // @@protoc_insertion_point(class_scope:aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest)
  private static final com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest();
  }

  public static com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<CdpiNodeStateRequest>
      PARSER = new com.google.protobuf.AbstractParser<CdpiNodeStateRequest>() {
    @java.lang.Override
    public CdpiNodeStateRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CdpiNodeStateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CdpiNodeStateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

