package com.grpc.proto.vault;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: vault.proto")
public final class vaultGrpc {

  private vaultGrpc() {}

  public static final String SERVICE_NAME = "vault";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.vault.Vault.Map,
      com.grpc.proto.vault.Vault.Value> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "put",
      requestType = com.grpc.proto.vault.Vault.Map.class,
      responseType = com.grpc.proto.vault.Vault.Value.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.vault.Vault.Map,
      com.grpc.proto.vault.Vault.Value> getPutMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.vault.Vault.Map, com.grpc.proto.vault.Vault.Value> getPutMethod;
    if ((getPutMethod = vaultGrpc.getPutMethod) == null) {
      synchronized (vaultGrpc.class) {
        if ((getPutMethod = vaultGrpc.getPutMethod) == null) {
          vaultGrpc.getPutMethod = getPutMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.vault.Vault.Map, com.grpc.proto.vault.Vault.Value>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "vault", "put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.vault.Vault.Map.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.vault.Vault.Value.getDefaultInstance()))
                  .setSchemaDescriptor(new vaultMethodDescriptorSupplier("put"))
                  .build();
          }
        }
     }
     return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.vault.Vault.Key,
      com.grpc.proto.vault.Vault.Map> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = com.grpc.proto.vault.Vault.Key.class,
      responseType = com.grpc.proto.vault.Vault.Map.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.vault.Vault.Key,
      com.grpc.proto.vault.Vault.Map> getGetMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.vault.Vault.Key, com.grpc.proto.vault.Vault.Map> getGetMethod;
    if ((getGetMethod = vaultGrpc.getGetMethod) == null) {
      synchronized (vaultGrpc.class) {
        if ((getGetMethod = vaultGrpc.getGetMethod) == null) {
          vaultGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.vault.Vault.Key, com.grpc.proto.vault.Vault.Map>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "vault", "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.vault.Vault.Key.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.vault.Vault.Map.getDefaultInstance()))
                  .setSchemaDescriptor(new vaultMethodDescriptorSupplier("get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.vault.Vault.Empty,
      com.grpc.proto.vault.Vault.Key> getGetAllKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllKeys",
      requestType = com.grpc.proto.vault.Vault.Empty.class,
      responseType = com.grpc.proto.vault.Vault.Key.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.grpc.proto.vault.Vault.Empty,
      com.grpc.proto.vault.Vault.Key> getGetAllKeysMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.vault.Vault.Empty, com.grpc.proto.vault.Vault.Key> getGetAllKeysMethod;
    if ((getGetAllKeysMethod = vaultGrpc.getGetAllKeysMethod) == null) {
      synchronized (vaultGrpc.class) {
        if ((getGetAllKeysMethod = vaultGrpc.getGetAllKeysMethod) == null) {
          vaultGrpc.getGetAllKeysMethod = getGetAllKeysMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.vault.Vault.Empty, com.grpc.proto.vault.Vault.Key>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "vault", "getAllKeys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.vault.Vault.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.vault.Vault.Key.getDefaultInstance()))
                  .setSchemaDescriptor(new vaultMethodDescriptorSupplier("getAllKeys"))
                  .build();
          }
        }
     }
     return getGetAllKeysMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static vaultStub newStub(io.grpc.Channel channel) {
    return new vaultStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static vaultBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new vaultBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static vaultFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new vaultFutureStub(channel);
  }

  /**
   */
  public static abstract class vaultImplBase implements io.grpc.BindableService {

    /**
     */
    public void put(com.grpc.proto.vault.Vault.Map request,
        io.grpc.stub.StreamObserver<com.grpc.proto.vault.Vault.Value> responseObserver) {
      asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     */
    public void get(com.grpc.proto.vault.Vault.Key request,
        io.grpc.stub.StreamObserver<com.grpc.proto.vault.Vault.Map> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void getAllKeys(com.grpc.proto.vault.Vault.Empty request,
        io.grpc.stub.StreamObserver<com.grpc.proto.vault.Vault.Key> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllKeysMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.vault.Vault.Map,
                com.grpc.proto.vault.Vault.Value>(
                  this, METHODID_PUT)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.vault.Vault.Key,
                com.grpc.proto.vault.Vault.Map>(
                  this, METHODID_GET)))
          .addMethod(
            getGetAllKeysMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.grpc.proto.vault.Vault.Empty,
                com.grpc.proto.vault.Vault.Key>(
                  this, METHODID_GET_ALL_KEYS)))
          .build();
    }
  }

  /**
   */
  public static final class vaultStub extends io.grpc.stub.AbstractStub<vaultStub> {
    private vaultStub(io.grpc.Channel channel) {
      super(channel);
    }

    private vaultStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected vaultStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new vaultStub(channel, callOptions);
    }

    /**
     */
    public void put(com.grpc.proto.vault.Vault.Map request,
        io.grpc.stub.StreamObserver<com.grpc.proto.vault.Vault.Value> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(com.grpc.proto.vault.Vault.Key request,
        io.grpc.stub.StreamObserver<com.grpc.proto.vault.Vault.Map> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllKeys(com.grpc.proto.vault.Vault.Empty request,
        io.grpc.stub.StreamObserver<com.grpc.proto.vault.Vault.Key> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAllKeysMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class vaultBlockingStub extends io.grpc.stub.AbstractStub<vaultBlockingStub> {
    private vaultBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private vaultBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected vaultBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new vaultBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.proto.vault.Vault.Value put(com.grpc.proto.vault.Vault.Map request) {
      return blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.proto.vault.Vault.Map get(com.grpc.proto.vault.Vault.Key request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.grpc.proto.vault.Vault.Key> getAllKeys(
        com.grpc.proto.vault.Vault.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAllKeysMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class vaultFutureStub extends io.grpc.stub.AbstractStub<vaultFutureStub> {
    private vaultFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private vaultFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected vaultFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new vaultFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.vault.Vault.Value> put(
        com.grpc.proto.vault.Vault.Map request) {
      return futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.vault.Vault.Map> get(
        com.grpc.proto.vault.Vault.Key request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUT = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_GET_ALL_KEYS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final vaultImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(vaultImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUT:
          serviceImpl.put((com.grpc.proto.vault.Vault.Map) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.vault.Vault.Value>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.grpc.proto.vault.Vault.Key) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.vault.Vault.Map>) responseObserver);
          break;
        case METHODID_GET_ALL_KEYS:
          serviceImpl.getAllKeys((com.grpc.proto.vault.Vault.Empty) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.vault.Vault.Key>) responseObserver);
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

  private static abstract class vaultBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    vaultBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.proto.vault.Vault.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("vault");
    }
  }

  private static final class vaultFileDescriptorSupplier
      extends vaultBaseDescriptorSupplier {
    vaultFileDescriptorSupplier() {}
  }

  private static final class vaultMethodDescriptorSupplier
      extends vaultBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    vaultMethodDescriptorSupplier(String methodName) {
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
      synchronized (vaultGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new vaultFileDescriptorSupplier())
              .addMethod(getPutMethod())
              .addMethod(getGetMethod())
              .addMethod(getGetAllKeysMethod())
              .build();
        }
      }
    }
    return result;
  }
}
