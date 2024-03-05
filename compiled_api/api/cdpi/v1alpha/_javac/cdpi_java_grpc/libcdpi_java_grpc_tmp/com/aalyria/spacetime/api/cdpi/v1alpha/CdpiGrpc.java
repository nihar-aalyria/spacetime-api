package com.aalyria.spacetime.api.cdpi.v1alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: api/cdpi/v1alpha/cdpi.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CdpiGrpc {

  private CdpiGrpc() {}

  public static final String SERVICE_NAME = "aalyria.spacetime.api.cdpi.v1alpha.Cdpi";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aalyria.spacetime.api.cdpi.v1alpha.CdpiRequest,
      com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse> getCdpiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Cdpi",
      requestType = com.aalyria.spacetime.api.cdpi.v1alpha.CdpiRequest.class,
      responseType = com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.aalyria.spacetime.api.cdpi.v1alpha.CdpiRequest,
      com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse> getCdpiMethod() {
    io.grpc.MethodDescriptor<com.aalyria.spacetime.api.cdpi.v1alpha.CdpiRequest, com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse> getCdpiMethod;
    if ((getCdpiMethod = CdpiGrpc.getCdpiMethod) == null) {
      synchronized (CdpiGrpc.class) {
        if ((getCdpiMethod = CdpiGrpc.getCdpiMethod) == null) {
          CdpiGrpc.getCdpiMethod = getCdpiMethod =
              io.grpc.MethodDescriptor.<com.aalyria.spacetime.api.cdpi.v1alpha.CdpiRequest, com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Cdpi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aalyria.spacetime.api.cdpi.v1alpha.CdpiRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CdpiMethodDescriptorSupplier("Cdpi"))
              .build();
        }
      }
    }
    return getCdpiMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest,
      com.google.protobuf.Empty> getUpdateNodeStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNodeState",
      requestType = com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest,
      com.google.protobuf.Empty> getUpdateNodeStateMethod() {
    io.grpc.MethodDescriptor<com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest, com.google.protobuf.Empty> getUpdateNodeStateMethod;
    if ((getUpdateNodeStateMethod = CdpiGrpc.getUpdateNodeStateMethod) == null) {
      synchronized (CdpiGrpc.class) {
        if ((getUpdateNodeStateMethod = CdpiGrpc.getUpdateNodeStateMethod) == null) {
          CdpiGrpc.getUpdateNodeStateMethod = getUpdateNodeStateMethod =
              io.grpc.MethodDescriptor.<com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNodeState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CdpiMethodDescriptorSupplier("UpdateNodeState"))
              .build();
        }
      }
    }
    return getUpdateNodeStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aalyria.spacetime.api.cdpi.v1alpha.CdpiRequestStatusRequest,
      com.google.protobuf.Empty> getUpdateRequestStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRequestStatus",
      requestType = com.aalyria.spacetime.api.cdpi.v1alpha.CdpiRequestStatusRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aalyria.spacetime.api.cdpi.v1alpha.CdpiRequestStatusRequest,
      com.google.protobuf.Empty> getUpdateRequestStatusMethod() {
    io.grpc.MethodDescriptor<com.aalyria.spacetime.api.cdpi.v1alpha.CdpiRequestStatusRequest, com.google.protobuf.Empty> getUpdateRequestStatusMethod;
    if ((getUpdateRequestStatusMethod = CdpiGrpc.getUpdateRequestStatusMethod) == null) {
      synchronized (CdpiGrpc.class) {
        if ((getUpdateRequestStatusMethod = CdpiGrpc.getUpdateRequestStatusMethod) == null) {
          CdpiGrpc.getUpdateRequestStatusMethod = getUpdateRequestStatusMethod =
              io.grpc.MethodDescriptor.<com.aalyria.spacetime.api.cdpi.v1alpha.CdpiRequestStatusRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRequestStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aalyria.spacetime.api.cdpi.v1alpha.CdpiRequestStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CdpiMethodDescriptorSupplier("UpdateRequestStatus"))
              .build();
        }
      }
    }
    return getUpdateRequestStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CdpiStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CdpiStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CdpiStub>() {
        @java.lang.Override
        public CdpiStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CdpiStub(channel, callOptions);
        }
      };
    return CdpiStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CdpiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CdpiBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CdpiBlockingStub>() {
        @java.lang.Override
        public CdpiBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CdpiBlockingStub(channel, callOptions);
        }
      };
    return CdpiBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CdpiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CdpiFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CdpiFutureStub>() {
        @java.lang.Override
        public CdpiFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CdpiFutureStub(channel, callOptions);
        }
      };
    return CdpiFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.cdpi.v1alpha.CdpiRequest> cdpi(
        io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCdpiMethod(), responseObserver);
    }

    /**
     */
    default void updateNodeState(com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNodeStateMethod(), responseObserver);
    }

    /**
     */
    default void updateRequestStatus(com.aalyria.spacetime.api.cdpi.v1alpha.CdpiRequestStatusRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRequestStatusMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Cdpi.
   */
  public static abstract class CdpiImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CdpiGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Cdpi.
   */
  public static final class CdpiStub
      extends io.grpc.stub.AbstractAsyncStub<CdpiStub> {
    private CdpiStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CdpiStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CdpiStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.cdpi.v1alpha.CdpiRequest> cdpi(
        io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getCdpiMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void updateNodeState(com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNodeStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRequestStatus(com.aalyria.spacetime.api.cdpi.v1alpha.CdpiRequestStatusRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRequestStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Cdpi.
   */
  public static final class CdpiBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CdpiBlockingStub> {
    private CdpiBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CdpiBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CdpiBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty updateNodeState(com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNodeStateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateRequestStatus(com.aalyria.spacetime.api.cdpi.v1alpha.CdpiRequestStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRequestStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Cdpi.
   */
  public static final class CdpiFutureStub
      extends io.grpc.stub.AbstractFutureStub<CdpiFutureStub> {
    private CdpiFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CdpiFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CdpiFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateNodeState(
        com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNodeStateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateRequestStatus(
        com.aalyria.spacetime.api.cdpi.v1alpha.CdpiRequestStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRequestStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE_NODE_STATE = 0;
  private static final int METHODID_UPDATE_REQUEST_STATUS = 1;
  private static final int METHODID_CDPI = 2;

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
        case METHODID_UPDATE_NODE_STATE:
          serviceImpl.updateNodeState((com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_REQUEST_STATUS:
          serviceImpl.updateRequestStatus((com.aalyria.spacetime.api.cdpi.v1alpha.CdpiRequestStatusRequest) request,
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
        case METHODID_CDPI:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.cdpi(
              (io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCdpiMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.aalyria.spacetime.api.cdpi.v1alpha.CdpiRequest,
              com.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse>(
                service, METHODID_CDPI)))
        .addMethod(
          getUpdateNodeStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest,
              com.google.protobuf.Empty>(
                service, METHODID_UPDATE_NODE_STATE)))
        .addMethod(
          getUpdateRequestStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aalyria.spacetime.api.cdpi.v1alpha.CdpiRequestStatusRequest,
              com.google.protobuf.Empty>(
                service, METHODID_UPDATE_REQUEST_STATUS)))
        .build();
  }

  private static abstract class CdpiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CdpiBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aalyria.spacetime.api.cdpi.v1alpha.CdpiProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Cdpi");
    }
  }

  private static final class CdpiFileDescriptorSupplier
      extends CdpiBaseDescriptorSupplier {
    CdpiFileDescriptorSupplier() {}
  }

  private static final class CdpiMethodDescriptorSupplier
      extends CdpiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CdpiMethodDescriptorSupplier(String methodName) {
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
      synchronized (CdpiGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CdpiFileDescriptorSupplier())
              .addMethod(getCdpiMethod())
              .addMethod(getUpdateNodeStateMethod())
              .addMethod(getUpdateRequestStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
