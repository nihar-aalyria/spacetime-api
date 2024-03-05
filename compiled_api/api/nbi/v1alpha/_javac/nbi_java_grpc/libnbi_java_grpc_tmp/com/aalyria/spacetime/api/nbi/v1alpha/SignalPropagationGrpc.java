package com.aalyria.spacetime.api.nbi.v1alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: api/nbi/v1alpha/signal_propagation.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SignalPropagationGrpc {

  private SignalPropagationGrpc() {}

  public static final String SERVICE_NAME = "aalyria.spacetime.api.nbi.v1alpha.SignalPropagation";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aalyria.spacetime.api.nbi.v1alpha.SignalPropagationOuterClass.SignalPropagationRequest,
      com.aalyria.spacetime.api.nbi.v1alpha.SignalPropagationOuterClass.SignalPropagationResponse> getEvaluateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Evaluate",
      requestType = com.aalyria.spacetime.api.nbi.v1alpha.SignalPropagationOuterClass.SignalPropagationRequest.class,
      responseType = com.aalyria.spacetime.api.nbi.v1alpha.SignalPropagationOuterClass.SignalPropagationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aalyria.spacetime.api.nbi.v1alpha.SignalPropagationOuterClass.SignalPropagationRequest,
      com.aalyria.spacetime.api.nbi.v1alpha.SignalPropagationOuterClass.SignalPropagationResponse> getEvaluateMethod() {
    io.grpc.MethodDescriptor<com.aalyria.spacetime.api.nbi.v1alpha.SignalPropagationOuterClass.SignalPropagationRequest, com.aalyria.spacetime.api.nbi.v1alpha.SignalPropagationOuterClass.SignalPropagationResponse> getEvaluateMethod;
    if ((getEvaluateMethod = SignalPropagationGrpc.getEvaluateMethod) == null) {
      synchronized (SignalPropagationGrpc.class) {
        if ((getEvaluateMethod = SignalPropagationGrpc.getEvaluateMethod) == null) {
          SignalPropagationGrpc.getEvaluateMethod = getEvaluateMethod =
              io.grpc.MethodDescriptor.<com.aalyria.spacetime.api.nbi.v1alpha.SignalPropagationOuterClass.SignalPropagationRequest, com.aalyria.spacetime.api.nbi.v1alpha.SignalPropagationOuterClass.SignalPropagationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Evaluate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aalyria.spacetime.api.nbi.v1alpha.SignalPropagationOuterClass.SignalPropagationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aalyria.spacetime.api.nbi.v1alpha.SignalPropagationOuterClass.SignalPropagationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SignalPropagationMethodDescriptorSupplier("Evaluate"))
              .build();
        }
      }
    }
    return getEvaluateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SignalPropagationStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SignalPropagationStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SignalPropagationStub>() {
        @java.lang.Override
        public SignalPropagationStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SignalPropagationStub(channel, callOptions);
        }
      };
    return SignalPropagationStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SignalPropagationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SignalPropagationBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SignalPropagationBlockingStub>() {
        @java.lang.Override
        public SignalPropagationBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SignalPropagationBlockingStub(channel, callOptions);
        }
      };
    return SignalPropagationBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SignalPropagationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SignalPropagationFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SignalPropagationFutureStub>() {
        @java.lang.Override
        public SignalPropagationFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SignalPropagationFutureStub(channel, callOptions);
        }
      };
    return SignalPropagationFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void evaluate(com.aalyria.spacetime.api.nbi.v1alpha.SignalPropagationOuterClass.SignalPropagationRequest request,
        io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.nbi.v1alpha.SignalPropagationOuterClass.SignalPropagationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEvaluateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SignalPropagation.
   */
  public static abstract class SignalPropagationImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SignalPropagationGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SignalPropagation.
   */
  public static final class SignalPropagationStub
      extends io.grpc.stub.AbstractAsyncStub<SignalPropagationStub> {
    private SignalPropagationStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SignalPropagationStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SignalPropagationStub(channel, callOptions);
    }

    /**
     */
    public void evaluate(com.aalyria.spacetime.api.nbi.v1alpha.SignalPropagationOuterClass.SignalPropagationRequest request,
        io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.nbi.v1alpha.SignalPropagationOuterClass.SignalPropagationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEvaluateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SignalPropagation.
   */
  public static final class SignalPropagationBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SignalPropagationBlockingStub> {
    private SignalPropagationBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SignalPropagationBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SignalPropagationBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.aalyria.spacetime.api.nbi.v1alpha.SignalPropagationOuterClass.SignalPropagationResponse evaluate(com.aalyria.spacetime.api.nbi.v1alpha.SignalPropagationOuterClass.SignalPropagationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEvaluateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SignalPropagation.
   */
  public static final class SignalPropagationFutureStub
      extends io.grpc.stub.AbstractFutureStub<SignalPropagationFutureStub> {
    private SignalPropagationFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SignalPropagationFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SignalPropagationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aalyria.spacetime.api.nbi.v1alpha.SignalPropagationOuterClass.SignalPropagationResponse> evaluate(
        com.aalyria.spacetime.api.nbi.v1alpha.SignalPropagationOuterClass.SignalPropagationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEvaluateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EVALUATE = 0;

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
        case METHODID_EVALUATE:
          serviceImpl.evaluate((com.aalyria.spacetime.api.nbi.v1alpha.SignalPropagationOuterClass.SignalPropagationRequest) request,
              (io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.nbi.v1alpha.SignalPropagationOuterClass.SignalPropagationResponse>) responseObserver);
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
          getEvaluateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aalyria.spacetime.api.nbi.v1alpha.SignalPropagationOuterClass.SignalPropagationRequest,
              com.aalyria.spacetime.api.nbi.v1alpha.SignalPropagationOuterClass.SignalPropagationResponse>(
                service, METHODID_EVALUATE)))
        .build();
  }

  private static abstract class SignalPropagationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SignalPropagationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aalyria.spacetime.api.nbi.v1alpha.SignalPropagationOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SignalPropagation");
    }
  }

  private static final class SignalPropagationFileDescriptorSupplier
      extends SignalPropagationBaseDescriptorSupplier {
    SignalPropagationFileDescriptorSupplier() {}
  }

  private static final class SignalPropagationMethodDescriptorSupplier
      extends SignalPropagationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SignalPropagationMethodDescriptorSupplier(String methodName) {
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
      synchronized (SignalPropagationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SignalPropagationFileDescriptorSupplier())
              .addMethod(getEvaluateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
