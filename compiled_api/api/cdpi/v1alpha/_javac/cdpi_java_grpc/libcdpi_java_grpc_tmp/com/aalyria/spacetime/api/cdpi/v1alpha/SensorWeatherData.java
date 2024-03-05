// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/cdpi/v1alpha/cdpi.proto

package com.aalyria.spacetime.api.cdpi.v1alpha;

/**
 * Protobuf type {@code aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData}
 */
public final class SensorWeatherData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData)
    SensorWeatherDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SensorWeatherData.newBuilder() to construct.
  private SensorWeatherData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SensorWeatherData() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SensorWeatherData();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aalyria.spacetime.api.cdpi.v1alpha.CdpiProto.internal_static_aalyria_spacetime_api_cdpi_v1alpha_SensorWeatherData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aalyria.spacetime.api.cdpi.v1alpha.CdpiProto.internal_static_aalyria_spacetime_api_cdpi_v1alpha_SensorWeatherData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData.class, com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData.Builder.class);
  }

  private int bitField0_;
  public static final int LOCATION_FIELD_NUMBER = 4;
  private com.aalyria.spacetime.api.common.Coordinates.GeodeticWgs84 location_;
  /**
   * <code>optional .aalyria.spacetime.api.common.GeodeticWgs84 location = 4 [json_name = "location"];</code>
   * @return Whether the location field is set.
   */
  @java.lang.Override
  public boolean hasLocation() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .aalyria.spacetime.api.common.GeodeticWgs84 location = 4 [json_name = "location"];</code>
   * @return The location.
   */
  @java.lang.Override
  public com.aalyria.spacetime.api.common.Coordinates.GeodeticWgs84 getLocation() {
    return location_ == null ? com.aalyria.spacetime.api.common.Coordinates.GeodeticWgs84.getDefaultInstance() : location_;
  }
  /**
   * <code>optional .aalyria.spacetime.api.common.GeodeticWgs84 location = 4 [json_name = "location"];</code>
   */
  @java.lang.Override
  public com.aalyria.spacetime.api.common.Coordinates.GeodeticWgs84OrBuilder getLocationOrBuilder() {
    return location_ == null ? com.aalyria.spacetime.api.common.Coordinates.GeodeticWgs84.getDefaultInstance() : location_;
  }

  public static final int WEATHER_DATA_FIELD_NUMBER = 3;
  private com.aalyria.spacetime.api.common.WirelessPropagation.WeatherDataForecast weatherData_;
  /**
   * <code>optional .aalyria.spacetime.api.common.WeatherDataForecast weather_data = 3 [json_name = "weatherData"];</code>
   * @return Whether the weatherData field is set.
   */
  @java.lang.Override
  public boolean hasWeatherData() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .aalyria.spacetime.api.common.WeatherDataForecast weather_data = 3 [json_name = "weatherData"];</code>
   * @return The weatherData.
   */
  @java.lang.Override
  public com.aalyria.spacetime.api.common.WirelessPropagation.WeatherDataForecast getWeatherData() {
    return weatherData_ == null ? com.aalyria.spacetime.api.common.WirelessPropagation.WeatherDataForecast.getDefaultInstance() : weatherData_;
  }
  /**
   * <code>optional .aalyria.spacetime.api.common.WeatherDataForecast weather_data = 3 [json_name = "weatherData"];</code>
   */
  @java.lang.Override
  public com.aalyria.spacetime.api.common.WirelessPropagation.WeatherDataForecastOrBuilder getWeatherDataOrBuilder() {
    return weatherData_ == null ? com.aalyria.spacetime.api.common.WirelessPropagation.WeatherDataForecast.getDefaultInstance() : weatherData_;
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
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getWeatherData());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(4, getLocation());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getWeatherData());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getLocation());
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
    if (!(obj instanceof com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData)) {
      return super.equals(obj);
    }
    com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData other = (com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData) obj;

    if (hasLocation() != other.hasLocation()) return false;
    if (hasLocation()) {
      if (!getLocation()
          .equals(other.getLocation())) return false;
    }
    if (hasWeatherData() != other.hasWeatherData()) return false;
    if (hasWeatherData()) {
      if (!getWeatherData()
          .equals(other.getWeatherData())) return false;
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
    if (hasLocation()) {
      hash = (37 * hash) + LOCATION_FIELD_NUMBER;
      hash = (53 * hash) + getLocation().hashCode();
    }
    if (hasWeatherData()) {
      hash = (37 * hash) + WEATHER_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getWeatherData().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData parseFrom(
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
  public static Builder newBuilder(com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData prototype) {
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
   * Protobuf type {@code aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData)
      com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aalyria.spacetime.api.cdpi.v1alpha.CdpiProto.internal_static_aalyria_spacetime_api_cdpi_v1alpha_SensorWeatherData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aalyria.spacetime.api.cdpi.v1alpha.CdpiProto.internal_static_aalyria_spacetime_api_cdpi_v1alpha_SensorWeatherData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData.class, com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData.Builder.class);
    }

    // Construct using com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData.newBuilder()
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
        getLocationFieldBuilder();
        getWeatherDataFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      location_ = null;
      if (locationBuilder_ != null) {
        locationBuilder_.dispose();
        locationBuilder_ = null;
      }
      weatherData_ = null;
      if (weatherDataBuilder_ != null) {
        weatherDataBuilder_.dispose();
        weatherDataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aalyria.spacetime.api.cdpi.v1alpha.CdpiProto.internal_static_aalyria_spacetime_api_cdpi_v1alpha_SensorWeatherData_descriptor;
    }

    @java.lang.Override
    public com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData getDefaultInstanceForType() {
      return com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData.getDefaultInstance();
    }

    @java.lang.Override
    public com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData build() {
      com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData buildPartial() {
      com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData result = new com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.location_ = locationBuilder_ == null
            ? location_
            : locationBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.weatherData_ = weatherDataBuilder_ == null
            ? weatherData_
            : weatherDataBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData) {
        return mergeFrom((com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData other) {
      if (other == com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData.getDefaultInstance()) return this;
      if (other.hasLocation()) {
        mergeLocation(other.getLocation());
      }
      if (other.hasWeatherData()) {
        mergeWeatherData(other.getWeatherData());
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
            case 26: {
              input.readMessage(
                  getWeatherDataFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getLocationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 34
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

    private com.aalyria.spacetime.api.common.Coordinates.GeodeticWgs84 location_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aalyria.spacetime.api.common.Coordinates.GeodeticWgs84, com.aalyria.spacetime.api.common.Coordinates.GeodeticWgs84.Builder, com.aalyria.spacetime.api.common.Coordinates.GeodeticWgs84OrBuilder> locationBuilder_;
    /**
     * <code>optional .aalyria.spacetime.api.common.GeodeticWgs84 location = 4 [json_name = "location"];</code>
     * @return Whether the location field is set.
     */
    public boolean hasLocation() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .aalyria.spacetime.api.common.GeodeticWgs84 location = 4 [json_name = "location"];</code>
     * @return The location.
     */
    public com.aalyria.spacetime.api.common.Coordinates.GeodeticWgs84 getLocation() {
      if (locationBuilder_ == null) {
        return location_ == null ? com.aalyria.spacetime.api.common.Coordinates.GeodeticWgs84.getDefaultInstance() : location_;
      } else {
        return locationBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .aalyria.spacetime.api.common.GeodeticWgs84 location = 4 [json_name = "location"];</code>
     */
    public Builder setLocation(com.aalyria.spacetime.api.common.Coordinates.GeodeticWgs84 value) {
      if (locationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        location_ = value;
      } else {
        locationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .aalyria.spacetime.api.common.GeodeticWgs84 location = 4 [json_name = "location"];</code>
     */
    public Builder setLocation(
        com.aalyria.spacetime.api.common.Coordinates.GeodeticWgs84.Builder builderForValue) {
      if (locationBuilder_ == null) {
        location_ = builderForValue.build();
      } else {
        locationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .aalyria.spacetime.api.common.GeodeticWgs84 location = 4 [json_name = "location"];</code>
     */
    public Builder mergeLocation(com.aalyria.spacetime.api.common.Coordinates.GeodeticWgs84 value) {
      if (locationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          location_ != null &&
          location_ != com.aalyria.spacetime.api.common.Coordinates.GeodeticWgs84.getDefaultInstance()) {
          getLocationBuilder().mergeFrom(value);
        } else {
          location_ = value;
        }
      } else {
        locationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .aalyria.spacetime.api.common.GeodeticWgs84 location = 4 [json_name = "location"];</code>
     */
    public Builder clearLocation() {
      bitField0_ = (bitField0_ & ~0x00000001);
      location_ = null;
      if (locationBuilder_ != null) {
        locationBuilder_.dispose();
        locationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .aalyria.spacetime.api.common.GeodeticWgs84 location = 4 [json_name = "location"];</code>
     */
    public com.aalyria.spacetime.api.common.Coordinates.GeodeticWgs84.Builder getLocationBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getLocationFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .aalyria.spacetime.api.common.GeodeticWgs84 location = 4 [json_name = "location"];</code>
     */
    public com.aalyria.spacetime.api.common.Coordinates.GeodeticWgs84OrBuilder getLocationOrBuilder() {
      if (locationBuilder_ != null) {
        return locationBuilder_.getMessageOrBuilder();
      } else {
        return location_ == null ?
            com.aalyria.spacetime.api.common.Coordinates.GeodeticWgs84.getDefaultInstance() : location_;
      }
    }
    /**
     * <code>optional .aalyria.spacetime.api.common.GeodeticWgs84 location = 4 [json_name = "location"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aalyria.spacetime.api.common.Coordinates.GeodeticWgs84, com.aalyria.spacetime.api.common.Coordinates.GeodeticWgs84.Builder, com.aalyria.spacetime.api.common.Coordinates.GeodeticWgs84OrBuilder> 
        getLocationFieldBuilder() {
      if (locationBuilder_ == null) {
        locationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aalyria.spacetime.api.common.Coordinates.GeodeticWgs84, com.aalyria.spacetime.api.common.Coordinates.GeodeticWgs84.Builder, com.aalyria.spacetime.api.common.Coordinates.GeodeticWgs84OrBuilder>(
                getLocation(),
                getParentForChildren(),
                isClean());
        location_ = null;
      }
      return locationBuilder_;
    }

    private com.aalyria.spacetime.api.common.WirelessPropagation.WeatherDataForecast weatherData_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aalyria.spacetime.api.common.WirelessPropagation.WeatherDataForecast, com.aalyria.spacetime.api.common.WirelessPropagation.WeatherDataForecast.Builder, com.aalyria.spacetime.api.common.WirelessPropagation.WeatherDataForecastOrBuilder> weatherDataBuilder_;
    /**
     * <code>optional .aalyria.spacetime.api.common.WeatherDataForecast weather_data = 3 [json_name = "weatherData"];</code>
     * @return Whether the weatherData field is set.
     */
    public boolean hasWeatherData() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .aalyria.spacetime.api.common.WeatherDataForecast weather_data = 3 [json_name = "weatherData"];</code>
     * @return The weatherData.
     */
    public com.aalyria.spacetime.api.common.WirelessPropagation.WeatherDataForecast getWeatherData() {
      if (weatherDataBuilder_ == null) {
        return weatherData_ == null ? com.aalyria.spacetime.api.common.WirelessPropagation.WeatherDataForecast.getDefaultInstance() : weatherData_;
      } else {
        return weatherDataBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .aalyria.spacetime.api.common.WeatherDataForecast weather_data = 3 [json_name = "weatherData"];</code>
     */
    public Builder setWeatherData(com.aalyria.spacetime.api.common.WirelessPropagation.WeatherDataForecast value) {
      if (weatherDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        weatherData_ = value;
      } else {
        weatherDataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .aalyria.spacetime.api.common.WeatherDataForecast weather_data = 3 [json_name = "weatherData"];</code>
     */
    public Builder setWeatherData(
        com.aalyria.spacetime.api.common.WirelessPropagation.WeatherDataForecast.Builder builderForValue) {
      if (weatherDataBuilder_ == null) {
        weatherData_ = builderForValue.build();
      } else {
        weatherDataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .aalyria.spacetime.api.common.WeatherDataForecast weather_data = 3 [json_name = "weatherData"];</code>
     */
    public Builder mergeWeatherData(com.aalyria.spacetime.api.common.WirelessPropagation.WeatherDataForecast value) {
      if (weatherDataBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          weatherData_ != null &&
          weatherData_ != com.aalyria.spacetime.api.common.WirelessPropagation.WeatherDataForecast.getDefaultInstance()) {
          getWeatherDataBuilder().mergeFrom(value);
        } else {
          weatherData_ = value;
        }
      } else {
        weatherDataBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .aalyria.spacetime.api.common.WeatherDataForecast weather_data = 3 [json_name = "weatherData"];</code>
     */
    public Builder clearWeatherData() {
      bitField0_ = (bitField0_ & ~0x00000002);
      weatherData_ = null;
      if (weatherDataBuilder_ != null) {
        weatherDataBuilder_.dispose();
        weatherDataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .aalyria.spacetime.api.common.WeatherDataForecast weather_data = 3 [json_name = "weatherData"];</code>
     */
    public com.aalyria.spacetime.api.common.WirelessPropagation.WeatherDataForecast.Builder getWeatherDataBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getWeatherDataFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .aalyria.spacetime.api.common.WeatherDataForecast weather_data = 3 [json_name = "weatherData"];</code>
     */
    public com.aalyria.spacetime.api.common.WirelessPropagation.WeatherDataForecastOrBuilder getWeatherDataOrBuilder() {
      if (weatherDataBuilder_ != null) {
        return weatherDataBuilder_.getMessageOrBuilder();
      } else {
        return weatherData_ == null ?
            com.aalyria.spacetime.api.common.WirelessPropagation.WeatherDataForecast.getDefaultInstance() : weatherData_;
      }
    }
    /**
     * <code>optional .aalyria.spacetime.api.common.WeatherDataForecast weather_data = 3 [json_name = "weatherData"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aalyria.spacetime.api.common.WirelessPropagation.WeatherDataForecast, com.aalyria.spacetime.api.common.WirelessPropagation.WeatherDataForecast.Builder, com.aalyria.spacetime.api.common.WirelessPropagation.WeatherDataForecastOrBuilder> 
        getWeatherDataFieldBuilder() {
      if (weatherDataBuilder_ == null) {
        weatherDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aalyria.spacetime.api.common.WirelessPropagation.WeatherDataForecast, com.aalyria.spacetime.api.common.WirelessPropagation.WeatherDataForecast.Builder, com.aalyria.spacetime.api.common.WirelessPropagation.WeatherDataForecastOrBuilder>(
                getWeatherData(),
                getParentForChildren(),
                isClean());
        weatherData_ = null;
      }
      return weatherDataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData)
  }

  // @@protoc_insertion_point(class_scope:aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData)
  private static final com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData();
  }

  public static com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<SensorWeatherData>
      PARSER = new com.google.protobuf.AbstractParser<SensorWeatherData>() {
    @java.lang.Override
    public SensorWeatherData parsePartialFrom(
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

  public static com.google.protobuf.Parser<SensorWeatherData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SensorWeatherData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
