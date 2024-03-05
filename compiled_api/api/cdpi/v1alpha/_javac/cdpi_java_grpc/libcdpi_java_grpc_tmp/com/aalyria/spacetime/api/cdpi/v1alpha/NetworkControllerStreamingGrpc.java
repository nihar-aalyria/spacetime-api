package com.aalyria.spacetime.api.cdpi.v1alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: api/cdpi/v1alpha/cdpi.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NetworkControllerStreamingGrpc {

  private NetworkControllerStreamingGrpc() {}

  public static final String SERVICE_NAME = "aalyria.spacetime.api.cdpi.v1alpha.NetworkControllerStreaming";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aalyria.spacetime.api.cdpi.v1alpha.ControlStateNotification,
      com.aalyria.spacetime.api.cdpi.v1alpha.ControlStateChangeRequest> getControlPlaneInterfaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ControlPlaneInterface",
      requestType = com.aalyria.spacetime.api.cdpi.v1alpha.ControlStateNotification.class,
      responseType = com.aalyria.spacetime.api.cdpi.v1alpha.ControlStateChangeRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.aalyria.spacetime.api.cdpi.v1alpha.ControlStateNotification,
      com.aalyria.spacetime.api.cdpi.v1alpha.ControlStateChangeRequest> getControlPlaneInterfaceMethod() {
    io.grpc.MethodDescriptor<com.aalyria.spacetime.api.cdpi.v1alpha.ControlStateNotification, com.aalyria.spacetime.api.cdpi.v1alpha.ControlStateChangeRequest> getControlPlaneInterfaceMethod;
    if ((getControlPlaneInterfaceMethod = NetworkControllerStreamingGrpc.getControlPlaneInterfaceMethod) == null) {
      synchronized (NetworkControllerStreamingGrpc.class) {
        if ((getControlPlaneInterfaceMethod = NetworkControllerStreamingGrpc.getControlPlaneInterfaceMethod) == null) {
          NetworkControllerStreamingGrpc.getControlPlaneInterfaceMethod = getControlPlaneInterfaceMethod =
              io.grpc.MethodDescriptor.<com.aalyria.spacetime.api.cdpi.v1alpha.ControlStateNotification, com.aalyria.spacetime.api.cdpi.v1alpha.ControlStateChangeRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ControlPlaneInterface"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aalyria.spacetime.api.cdpi.v1alpha.ControlStateNotification.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aalyria.spacetime.api.cdpi.v1alpha.ControlStateChangeRequest.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkControllerStreamingMethodDescriptorSupplier("ControlPlaneInterface"))
              .build();
        }
      }
    }
    return getControlPlaneInterfaceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NetworkControllerStreamingStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NetworkControllerStreamingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NetworkControllerStreamingStub>() {
        @java.lang.Override
        public NetworkControllerStreamingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NetworkControllerStreamingStub(channel, callOptions);
        }
      };
    return NetworkControllerStreamingStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NetworkControllerStreamingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NetworkControllerStreamingBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NetworkControllerStreamingBlockingStub>() {
        @java.lang.Override
        public NetworkControllerStreamingBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NetworkControllerStreamingBlockingStub(channel, callOptions);
        }
      };
    return NetworkControllerStreamingBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NetworkControllerStreamingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NetworkControllerStreamingFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NetworkControllerStreamingFutureStub>() {
        @java.lang.Override
        public NetworkControllerStreamingFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NetworkControllerStreamingFutureStub(channel, callOptions);
        }
      };
    return NetworkControllerStreamingFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.cdpi.v1alpha.ControlStateNotification> controlPlaneInterface(
        io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.cdpi.v1alpha.ControlStateChangeRequest> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getControlPlaneInterfaceMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service NetworkControllerStreaming.
   */
  public static abstract class NetworkControllerStreamingImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return NetworkControllerStreamingGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service NetworkControllerStreaming.
   */
  public static final class NetworkControllerStreamingStub
      extends io.grpc.stub.AbstractAsyncStub<NetworkControllerStreamingStub> {
    private NetworkControllerStreamingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkControllerStreamingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NetworkControllerStreamingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.cdpi.v1alpha.ControlStateNotification> controlPlaneInterface(
        io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.cdpi.v1alpha.ControlStateChangeRequest> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getControlPlaneInterfaceMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service NetworkControllerStreaming.
   */
  public static final class NetworkControllerStreamingBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<NetworkControllerStreamingBlockingStub> {
    private NetworkControllerStreamingBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkControllerStreamingBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NetworkControllerStreamingBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service NetworkControllerStreaming.
   */
  public static final class NetworkControllerStreamingFutureStub
      extends io.grpc.stub.AbstractFutureStub<NetworkControllerStreamingFutureStub> {
    private NetworkControllerStreamingFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkControllerStreamingFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NetworkControllerStreamingFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CONTROL_PLANE_INTERFACE = 0;

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
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONTROL_PLANE_INTERFACE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.controlPlaneInterface(
              (io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.cdpi.v1alpha.ControlStateChangeRequest>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getControlPlaneInterfaceMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.aalyria.spacetime.api.cdpi.v1alpha.ControlStateNotification,
              com.aalyria.spacetime.api.cdpi.v1alpha.ControlStateChangeRequest>(
                service, METHODID_CONTROL_PLANE_INTERFACE)))
        .build();
  }

  private static abstract class NetworkControllerStreamingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NetworkControllerStreamingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aalyria.spacetime.api.cdpi.v1alpha.CdpiProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NetworkControllerStreaming");
    }
  }

  private static final class NetworkControllerStreamingFileDescriptorSupplier
      extends NetworkControllerStreamingBaseDescriptorSupplier {
    NetworkControllerStreamingFileDescriptorSupplier() {}
  }

  private static final class NetworkControllerStreamingMethodDescriptorSupplier
      extends NetworkControllerStreamingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NetworkControllerStreamingMethodDescriptorSupplier(String methodName) {
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
      synchronized (NetworkControllerStreamingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NetworkControllerStreamingFileDescriptorSupplier())
              .addMethod(getControlPlaneInterfaceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
