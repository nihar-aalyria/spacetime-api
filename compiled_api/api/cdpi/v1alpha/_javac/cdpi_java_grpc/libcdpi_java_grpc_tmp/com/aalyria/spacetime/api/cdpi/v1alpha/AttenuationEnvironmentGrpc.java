package com.aalyria.spacetime.api.cdpi.v1alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: api/cdpi/v1alpha/cdpi.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AttenuationEnvironmentGrpc {

  private AttenuationEnvironmentGrpc() {}

  public static final String SERVICE_NAME = "aalyria.spacetime.api.cdpi.v1alpha.AttenuationEnvironment";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData,
      com.google.protobuf.Empty> getUploadSensorDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadSensorData",
      requestType = com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData,
      com.google.protobuf.Empty> getUploadSensorDataMethod() {
    io.grpc.MethodDescriptor<com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData, com.google.protobuf.Empty> getUploadSensorDataMethod;
    if ((getUploadSensorDataMethod = AttenuationEnvironmentGrpc.getUploadSensorDataMethod) == null) {
      synchronized (AttenuationEnvironmentGrpc.class) {
        if ((getUploadSensorDataMethod = AttenuationEnvironmentGrpc.getUploadSensorDataMethod) == null) {
          AttenuationEnvironmentGrpc.getUploadSensorDataMethod = getUploadSensorDataMethod =
              io.grpc.MethodDescriptor.<com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadSensorData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AttenuationEnvironmentMethodDescriptorSupplier("UploadSensorData"))
              .build();
        }
      }
    }
    return getUploadSensorDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AttenuationEnvironmentStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AttenuationEnvironmentStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AttenuationEnvironmentStub>() {
        @java.lang.Override
        public AttenuationEnvironmentStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AttenuationEnvironmentStub(channel, callOptions);
        }
      };
    return AttenuationEnvironmentStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AttenuationEnvironmentBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AttenuationEnvironmentBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AttenuationEnvironmentBlockingStub>() {
        @java.lang.Override
        public AttenuationEnvironmentBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AttenuationEnvironmentBlockingStub(channel, callOptions);
        }
      };
    return AttenuationEnvironmentBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AttenuationEnvironmentFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AttenuationEnvironmentFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AttenuationEnvironmentFutureStub>() {
        @java.lang.Override
        public AttenuationEnvironmentFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AttenuationEnvironmentFutureStub(channel, callOptions);
        }
      };
    return AttenuationEnvironmentFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void uploadSensorData(com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadSensorDataMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AttenuationEnvironment.
   */
  public static abstract class AttenuationEnvironmentImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AttenuationEnvironmentGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AttenuationEnvironment.
   */
  public static final class AttenuationEnvironmentStub
      extends io.grpc.stub.AbstractAsyncStub<AttenuationEnvironmentStub> {
    private AttenuationEnvironmentStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AttenuationEnvironmentStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AttenuationEnvironmentStub(channel, callOptions);
    }

    /**
     */
    public void uploadSensorData(com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadSensorDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AttenuationEnvironment.
   */
  public static final class AttenuationEnvironmentBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AttenuationEnvironmentBlockingStub> {
    private AttenuationEnvironmentBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AttenuationEnvironmentBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AttenuationEnvironmentBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty uploadSensorData(com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadSensorDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AttenuationEnvironment.
   */
  public static final class AttenuationEnvironmentFutureStub
      extends io.grpc.stub.AbstractFutureStub<AttenuationEnvironmentFutureStub> {
    private AttenuationEnvironmentFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AttenuationEnvironmentFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AttenuationEnvironmentFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> uploadSensorData(
        com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadSensorDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPLOAD_SENSOR_DATA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD_SENSOR_DATA:
          serviceImpl.uploadSensorData((com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getUploadSensorDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData,
              com.google.protobuf.Empty>(
                service, METHODID_UPLOAD_SENSOR_DATA)))
        .build();
  }

  private static abstract class AttenuationEnvironmentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AttenuationEnvironmentBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aalyria.spacetime.api.cdpi.v1alpha.CdpiProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AttenuationEnvironment");
    }
  }

  private static final class AttenuationEnvironmentFileDescriptorSupplier
      extends AttenuationEnvironmentBaseDescriptorSupplier {
    AttenuationEnvironmentFileDescriptorSupplier() {}
  }

  private static final class AttenuationEnvironmentMethodDescriptorSupplier
      extends AttenuationEnvironmentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AttenuationEnvironmentMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AttenuationEnvironmentGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AttenuationEnvironmentFileDescriptorSupplier())
              .addMethod(getUploadSensorDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
