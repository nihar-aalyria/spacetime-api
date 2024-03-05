package com.aalyria.spacetime.api.nbi.v1alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: api/nbi/v1alpha/nbi.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NetOpsGrpc {

  private NetOpsGrpc() {}

  public static final String SERVICE_NAME = "aalyria.spacetime.api.nbi.v1alpha.NetOps";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.GetEntityRequest,
      com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity> getGetEntityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEntity",
      requestType = com.aalyria.spacetime.api.nbi.v1alpha.Nbi.GetEntityRequest.class,
      responseType = com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.GetEntityRequest,
      com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity> getGetEntityMethod() {
    io.grpc.MethodDescriptor<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.GetEntityRequest, com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity> getGetEntityMethod;
    if ((getGetEntityMethod = NetOpsGrpc.getGetEntityMethod) == null) {
      synchronized (NetOpsGrpc.class) {
        if ((getGetEntityMethod = NetOpsGrpc.getGetEntityMethod) == null) {
          NetOpsGrpc.getGetEntityMethod = getGetEntityMethod =
              io.grpc.MethodDescriptor.<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.GetEntityRequest, com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEntity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aalyria.spacetime.api.nbi.v1alpha.Nbi.GetEntityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity.getDefaultInstance()))
              .setSchemaDescriptor(new NetOpsMethodDescriptorSupplier("GetEntity"))
              .build();
        }
      }
    }
    return getGetEntityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.CreateEntityRequest,
      com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity> getCreateEntityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEntity",
      requestType = com.aalyria.spacetime.api.nbi.v1alpha.Nbi.CreateEntityRequest.class,
      responseType = com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.CreateEntityRequest,
      com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity> getCreateEntityMethod() {
    io.grpc.MethodDescriptor<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.CreateEntityRequest, com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity> getCreateEntityMethod;
    if ((getCreateEntityMethod = NetOpsGrpc.getCreateEntityMethod) == null) {
      synchronized (NetOpsGrpc.class) {
        if ((getCreateEntityMethod = NetOpsGrpc.getCreateEntityMethod) == null) {
          NetOpsGrpc.getCreateEntityMethod = getCreateEntityMethod =
              io.grpc.MethodDescriptor.<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.CreateEntityRequest, com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEntity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aalyria.spacetime.api.nbi.v1alpha.Nbi.CreateEntityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity.getDefaultInstance()))
              .setSchemaDescriptor(new NetOpsMethodDescriptorSupplier("CreateEntity"))
              .build();
        }
      }
    }
    return getCreateEntityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.UpdateEntityRequest,
      com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity> getUpdateEntityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEntity",
      requestType = com.aalyria.spacetime.api.nbi.v1alpha.Nbi.UpdateEntityRequest.class,
      responseType = com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.UpdateEntityRequest,
      com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity> getUpdateEntityMethod() {
    io.grpc.MethodDescriptor<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.UpdateEntityRequest, com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity> getUpdateEntityMethod;
    if ((getUpdateEntityMethod = NetOpsGrpc.getUpdateEntityMethod) == null) {
      synchronized (NetOpsGrpc.class) {
        if ((getUpdateEntityMethod = NetOpsGrpc.getUpdateEntityMethod) == null) {
          NetOpsGrpc.getUpdateEntityMethod = getUpdateEntityMethod =
              io.grpc.MethodDescriptor.<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.UpdateEntityRequest, com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEntity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aalyria.spacetime.api.nbi.v1alpha.Nbi.UpdateEntityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity.getDefaultInstance()))
              .setSchemaDescriptor(new NetOpsMethodDescriptorSupplier("UpdateEntity"))
              .build();
        }
      }
    }
    return getUpdateEntityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesRequest,
      com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesResponse> getListEntitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEntities",
      requestType = com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesRequest.class,
      responseType = com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesRequest,
      com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesResponse> getListEntitiesMethod() {
    io.grpc.MethodDescriptor<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesRequest, com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesResponse> getListEntitiesMethod;
    if ((getListEntitiesMethod = NetOpsGrpc.getListEntitiesMethod) == null) {
      synchronized (NetOpsGrpc.class) {
        if ((getListEntitiesMethod = NetOpsGrpc.getListEntitiesMethod) == null) {
          NetOpsGrpc.getListEntitiesMethod = getListEntitiesMethod =
              io.grpc.MethodDescriptor.<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesRequest, com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListEntities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NetOpsMethodDescriptorSupplier("ListEntities"))
              .build();
        }
      }
    }
    return getListEntitiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesOverTimeRequest,
      com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesOverTimeResponse> getListEntitiesOverTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEntitiesOverTime",
      requestType = com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesOverTimeRequest.class,
      responseType = com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesOverTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesOverTimeRequest,
      com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesOverTimeResponse> getListEntitiesOverTimeMethod() {
    io.grpc.MethodDescriptor<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesOverTimeRequest, com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesOverTimeResponse> getListEntitiesOverTimeMethod;
    if ((getListEntitiesOverTimeMethod = NetOpsGrpc.getListEntitiesOverTimeMethod) == null) {
      synchronized (NetOpsGrpc.class) {
        if ((getListEntitiesOverTimeMethod = NetOpsGrpc.getListEntitiesOverTimeMethod) == null) {
          NetOpsGrpc.getListEntitiesOverTimeMethod = getListEntitiesOverTimeMethod =
              io.grpc.MethodDescriptor.<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesOverTimeRequest, com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesOverTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListEntitiesOverTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesOverTimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesOverTimeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NetOpsMethodDescriptorSupplier("ListEntitiesOverTime"))
              .build();
        }
      }
    }
    return getListEntitiesOverTimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.DeleteEntityRequest,
      com.aalyria.spacetime.api.nbi.v1alpha.Nbi.DeleteEntityResponse> getDeleteEntityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEntity",
      requestType = com.aalyria.spacetime.api.nbi.v1alpha.Nbi.DeleteEntityRequest.class,
      responseType = com.aalyria.spacetime.api.nbi.v1alpha.Nbi.DeleteEntityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.DeleteEntityRequest,
      com.aalyria.spacetime.api.nbi.v1alpha.Nbi.DeleteEntityResponse> getDeleteEntityMethod() {
    io.grpc.MethodDescriptor<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.DeleteEntityRequest, com.aalyria.spacetime.api.nbi.v1alpha.Nbi.DeleteEntityResponse> getDeleteEntityMethod;
    if ((getDeleteEntityMethod = NetOpsGrpc.getDeleteEntityMethod) == null) {
      synchronized (NetOpsGrpc.class) {
        if ((getDeleteEntityMethod = NetOpsGrpc.getDeleteEntityMethod) == null) {
          NetOpsGrpc.getDeleteEntityMethod = getDeleteEntityMethod =
              io.grpc.MethodDescriptor.<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.DeleteEntityRequest, com.aalyria.spacetime.api.nbi.v1alpha.Nbi.DeleteEntityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEntity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aalyria.spacetime.api.nbi.v1alpha.Nbi.DeleteEntityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aalyria.spacetime.api.nbi.v1alpha.Nbi.DeleteEntityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NetOpsMethodDescriptorSupplier("DeleteEntity"))
              .build();
        }
      }
    }
    return getDeleteEntityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.LoadScenarioRequest,
      com.aalyria.spacetime.api.nbi.v1alpha.Nbi.LoadScenarioResponse> getLoadScenarioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LoadScenario",
      requestType = com.aalyria.spacetime.api.nbi.v1alpha.Nbi.LoadScenarioRequest.class,
      responseType = com.aalyria.spacetime.api.nbi.v1alpha.Nbi.LoadScenarioResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.LoadScenarioRequest,
      com.aalyria.spacetime.api.nbi.v1alpha.Nbi.LoadScenarioResponse> getLoadScenarioMethod() {
    io.grpc.MethodDescriptor<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.LoadScenarioRequest, com.aalyria.spacetime.api.nbi.v1alpha.Nbi.LoadScenarioResponse> getLoadScenarioMethod;
    if ((getLoadScenarioMethod = NetOpsGrpc.getLoadScenarioMethod) == null) {
      synchronized (NetOpsGrpc.class) {
        if ((getLoadScenarioMethod = NetOpsGrpc.getLoadScenarioMethod) == null) {
          NetOpsGrpc.getLoadScenarioMethod = getLoadScenarioMethod =
              io.grpc.MethodDescriptor.<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.LoadScenarioRequest, com.aalyria.spacetime.api.nbi.v1alpha.Nbi.LoadScenarioResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LoadScenario"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aalyria.spacetime.api.nbi.v1alpha.Nbi.LoadScenarioRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aalyria.spacetime.api.nbi.v1alpha.Nbi.LoadScenarioResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NetOpsMethodDescriptorSupplier("LoadScenario"))
              .build();
        }
      }
    }
    return getLoadScenarioMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NetOpsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NetOpsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NetOpsStub>() {
        @java.lang.Override
        public NetOpsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NetOpsStub(channel, callOptions);
        }
      };
    return NetOpsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NetOpsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NetOpsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NetOpsBlockingStub>() {
        @java.lang.Override
        public NetOpsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NetOpsBlockingStub(channel, callOptions);
        }
      };
    return NetOpsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NetOpsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NetOpsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NetOpsFutureStub>() {
        @java.lang.Override
        public NetOpsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NetOpsFutureStub(channel, callOptions);
        }
      };
    return NetOpsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getEntity(com.aalyria.spacetime.api.nbi.v1alpha.Nbi.GetEntityRequest request,
        io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEntityMethod(), responseObserver);
    }

    /**
     */
    default void createEntity(com.aalyria.spacetime.api.nbi.v1alpha.Nbi.CreateEntityRequest request,
        io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEntityMethod(), responseObserver);
    }

    /**
     */
    default void updateEntity(com.aalyria.spacetime.api.nbi.v1alpha.Nbi.UpdateEntityRequest request,
        io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEntityMethod(), responseObserver);
    }

    /**
     */
    default void listEntities(com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesRequest request,
        io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListEntitiesMethod(), responseObserver);
    }

    /**
     */
    default void listEntitiesOverTime(com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesOverTimeRequest request,
        io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesOverTimeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListEntitiesOverTimeMethod(), responseObserver);
    }

    /**
     */
    default void deleteEntity(com.aalyria.spacetime.api.nbi.v1alpha.Nbi.DeleteEntityRequest request,
        io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.DeleteEntityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEntityMethod(), responseObserver);
    }

    /**
     */
    @java.lang.Deprecated
    default void loadScenario(com.aalyria.spacetime.api.nbi.v1alpha.Nbi.LoadScenarioRequest request,
        io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.LoadScenarioResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoadScenarioMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service NetOps.
   */
  public static abstract class NetOpsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return NetOpsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service NetOps.
   */
  public static final class NetOpsStub
      extends io.grpc.stub.AbstractAsyncStub<NetOpsStub> {
    private NetOpsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetOpsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NetOpsStub(channel, callOptions);
    }

    /**
     */
    public void getEntity(com.aalyria.spacetime.api.nbi.v1alpha.Nbi.GetEntityRequest request,
        io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEntityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createEntity(com.aalyria.spacetime.api.nbi.v1alpha.Nbi.CreateEntityRequest request,
        io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEntityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEntity(com.aalyria.spacetime.api.nbi.v1alpha.Nbi.UpdateEntityRequest request,
        io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEntityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listEntities(com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesRequest request,
        io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListEntitiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listEntitiesOverTime(com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesOverTimeRequest request,
        io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesOverTimeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListEntitiesOverTimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteEntity(com.aalyria.spacetime.api.nbi.v1alpha.Nbi.DeleteEntityRequest request,
        io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.DeleteEntityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEntityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    @java.lang.Deprecated
    public void loadScenario(com.aalyria.spacetime.api.nbi.v1alpha.Nbi.LoadScenarioRequest request,
        io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.LoadScenarioResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoadScenarioMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service NetOps.
   */
  public static final class NetOpsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<NetOpsBlockingStub> {
    private NetOpsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetOpsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NetOpsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity getEntity(com.aalyria.spacetime.api.nbi.v1alpha.Nbi.GetEntityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEntityMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity createEntity(com.aalyria.spacetime.api.nbi.v1alpha.Nbi.CreateEntityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEntityMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity updateEntity(com.aalyria.spacetime.api.nbi.v1alpha.Nbi.UpdateEntityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEntityMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesResponse listEntities(com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListEntitiesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesOverTimeResponse listEntitiesOverTime(com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesOverTimeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListEntitiesOverTimeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aalyria.spacetime.api.nbi.v1alpha.Nbi.DeleteEntityResponse deleteEntity(com.aalyria.spacetime.api.nbi.v1alpha.Nbi.DeleteEntityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEntityMethod(), getCallOptions(), request);
    }

    /**
     */
    @java.lang.Deprecated
    public com.aalyria.spacetime.api.nbi.v1alpha.Nbi.LoadScenarioResponse loadScenario(com.aalyria.spacetime.api.nbi.v1alpha.Nbi.LoadScenarioRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoadScenarioMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service NetOps.
   */
  public static final class NetOpsFutureStub
      extends io.grpc.stub.AbstractFutureStub<NetOpsFutureStub> {
    private NetOpsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetOpsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NetOpsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity> getEntity(
        com.aalyria.spacetime.api.nbi.v1alpha.Nbi.GetEntityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEntityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity> createEntity(
        com.aalyria.spacetime.api.nbi.v1alpha.Nbi.CreateEntityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEntityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity> updateEntity(
        com.aalyria.spacetime.api.nbi.v1alpha.Nbi.UpdateEntityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEntityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesResponse> listEntities(
        com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListEntitiesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesOverTimeResponse> listEntitiesOverTime(
        com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesOverTimeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListEntitiesOverTimeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.DeleteEntityResponse> deleteEntity(
        com.aalyria.spacetime.api.nbi.v1alpha.Nbi.DeleteEntityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEntityMethod(), getCallOptions()), request);
    }

    /**
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.LoadScenarioResponse> loadScenario(
        com.aalyria.spacetime.api.nbi.v1alpha.Nbi.LoadScenarioRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoadScenarioMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ENTITY = 0;
  private static final int METHODID_CREATE_ENTITY = 1;
  private static final int METHODID_UPDATE_ENTITY = 2;
  private static final int METHODID_LIST_ENTITIES = 3;
  private static final int METHODID_LIST_ENTITIES_OVER_TIME = 4;
  private static final int METHODID_DELETE_ENTITY = 5;
  private static final int METHODID_LOAD_SCENARIO = 6;

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
        case METHODID_GET_ENTITY:
          serviceImpl.getEntity((com.aalyria.spacetime.api.nbi.v1alpha.Nbi.GetEntityRequest) request,
              (io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity>) responseObserver);
          break;
        case METHODID_CREATE_ENTITY:
          serviceImpl.createEntity((com.aalyria.spacetime.api.nbi.v1alpha.Nbi.CreateEntityRequest) request,
              (io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity>) responseObserver);
          break;
        case METHODID_UPDATE_ENTITY:
          serviceImpl.updateEntity((com.aalyria.spacetime.api.nbi.v1alpha.Nbi.UpdateEntityRequest) request,
              (io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity>) responseObserver);
          break;
        case METHODID_LIST_ENTITIES:
          serviceImpl.listEntities((com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesRequest) request,
              (io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesResponse>) responseObserver);
          break;
        case METHODID_LIST_ENTITIES_OVER_TIME:
          serviceImpl.listEntitiesOverTime((com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesOverTimeRequest) request,
              (io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesOverTimeResponse>) responseObserver);
          break;
        case METHODID_DELETE_ENTITY:
          serviceImpl.deleteEntity((com.aalyria.spacetime.api.nbi.v1alpha.Nbi.DeleteEntityRequest) request,
              (io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.DeleteEntityResponse>) responseObserver);
          break;
        case METHODID_LOAD_SCENARIO:
          serviceImpl.loadScenario((com.aalyria.spacetime.api.nbi.v1alpha.Nbi.LoadScenarioRequest) request,
              (io.grpc.stub.StreamObserver<com.aalyria.spacetime.api.nbi.v1alpha.Nbi.LoadScenarioResponse>) responseObserver);
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
          getGetEntityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aalyria.spacetime.api.nbi.v1alpha.Nbi.GetEntityRequest,
              com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity>(
                service, METHODID_GET_ENTITY)))
        .addMethod(
          getCreateEntityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aalyria.spacetime.api.nbi.v1alpha.Nbi.CreateEntityRequest,
              com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity>(
                service, METHODID_CREATE_ENTITY)))
        .addMethod(
          getUpdateEntityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aalyria.spacetime.api.nbi.v1alpha.Nbi.UpdateEntityRequest,
              com.aalyria.spacetime.api.nbi.v1alpha.Nbi.Entity>(
                service, METHODID_UPDATE_ENTITY)))
        .addMethod(
          getListEntitiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesRequest,
              com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesResponse>(
                service, METHODID_LIST_ENTITIES)))
        .addMethod(
          getListEntitiesOverTimeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesOverTimeRequest,
              com.aalyria.spacetime.api.nbi.v1alpha.Nbi.ListEntitiesOverTimeResponse>(
                service, METHODID_LIST_ENTITIES_OVER_TIME)))
        .addMethod(
          getDeleteEntityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aalyria.spacetime.api.nbi.v1alpha.Nbi.DeleteEntityRequest,
              com.aalyria.spacetime.api.nbi.v1alpha.Nbi.DeleteEntityResponse>(
                service, METHODID_DELETE_ENTITY)))
        .addMethod(
          getLoadScenarioMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aalyria.spacetime.api.nbi.v1alpha.Nbi.LoadScenarioRequest,
              com.aalyria.spacetime.api.nbi.v1alpha.Nbi.LoadScenarioResponse>(
                service, METHODID_LOAD_SCENARIO)))
        .build();
  }

  private static abstract class NetOpsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NetOpsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aalyria.spacetime.api.nbi.v1alpha.Nbi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NetOps");
    }
  }

  private static final class NetOpsFileDescriptorSupplier
      extends NetOpsBaseDescriptorSupplier {
    NetOpsFileDescriptorSupplier() {}
  }

  private static final class NetOpsMethodDescriptorSupplier
      extends NetOpsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NetOpsMethodDescriptorSupplier(String methodName) {
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
      synchronized (NetOpsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NetOpsFileDescriptorSupplier())
              .addMethod(getGetEntityMethod())
              .addMethod(getCreateEntityMethod())
              .addMethod(getUpdateEntityMethod())
              .addMethod(getListEntitiesMethod())
              .addMethod(getListEntitiesOverTimeMethod())
              .addMethod(getDeleteEntityMethod())
              .addMethod(getLoadScenarioMethod())
              .build();
        }
      }
    }
    return result;
  }
}
