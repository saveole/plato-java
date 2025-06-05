package org.saveole.grpc.greeting;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 定义服务接口
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class GreetingServiceGrpc {

  private GreetingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "org.saveole.grpc.greeting.GreetingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.saveole.grpc.greeting.HelloRequest,
      org.saveole.grpc.greeting.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = org.saveole.grpc.greeting.HelloRequest.class,
      responseType = org.saveole.grpc.greeting.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.saveole.grpc.greeting.HelloRequest,
      org.saveole.grpc.greeting.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<org.saveole.grpc.greeting.HelloRequest, org.saveole.grpc.greeting.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = GreetingServiceGrpc.getSayHelloMethod) == null) {
      synchronized (GreetingServiceGrpc.class) {
        if ((getSayHelloMethod = GreetingServiceGrpc.getSayHelloMethod) == null) {
          GreetingServiceGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<org.saveole.grpc.greeting.HelloRequest, org.saveole.grpc.greeting.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.saveole.grpc.greeting.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.saveole.grpc.greeting.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreetingServiceMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreetingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetingServiceStub>() {
        @java.lang.Override
        public GreetingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetingServiceStub(channel, callOptions);
        }
      };
    return GreetingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static GreetingServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetingServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetingServiceBlockingV2Stub>() {
        @java.lang.Override
        public GreetingServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetingServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return GreetingServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreetingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetingServiceBlockingStub>() {
        @java.lang.Override
        public GreetingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetingServiceBlockingStub(channel, callOptions);
        }
      };
    return GreetingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreetingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetingServiceFutureStub>() {
        @java.lang.Override
        public GreetingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetingServiceFutureStub(channel, callOptions);
        }
      };
    return GreetingServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 定义服务接口
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 定义一个 RPC 方法（一元 RPC）
     * </pre>
     */
    default void sayHello(org.saveole.grpc.greeting.HelloRequest request,
        io.grpc.stub.StreamObserver<org.saveole.grpc.greeting.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GreetingService.
   * <pre>
   * 定义服务接口
   * </pre>
   */
  public static abstract class GreetingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GreetingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GreetingService.
   * <pre>
   * 定义服务接口
   * </pre>
   */
  public static final class GreetingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<GreetingServiceStub> {
    private GreetingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 定义一个 RPC 方法（一元 RPC）
     * </pre>
     */
    public void sayHello(org.saveole.grpc.greeting.HelloRequest request,
        io.grpc.stub.StreamObserver<org.saveole.grpc.greeting.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GreetingService.
   * <pre>
   * 定义服务接口
   * </pre>
   */
  public static final class GreetingServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<GreetingServiceBlockingV2Stub> {
    private GreetingServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetingServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * 定义一个 RPC 方法（一元 RPC）
     * </pre>
     */
    public org.saveole.grpc.greeting.HelloReply sayHello(org.saveole.grpc.greeting.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service GreetingService.
   * <pre>
   * 定义服务接口
   * </pre>
   */
  public static final class GreetingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GreetingServiceBlockingStub> {
    private GreetingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 定义一个 RPC 方法（一元 RPC）
     * </pre>
     */
    public org.saveole.grpc.greeting.HelloReply sayHello(org.saveole.grpc.greeting.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GreetingService.
   * <pre>
   * 定义服务接口
   * </pre>
   */
  public static final class GreetingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<GreetingServiceFutureStub> {
    private GreetingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 定义一个 RPC 方法（一元 RPC）
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.saveole.grpc.greeting.HelloReply> sayHello(
        org.saveole.grpc.greeting.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

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
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((org.saveole.grpc.greeting.HelloRequest) request,
              (io.grpc.stub.StreamObserver<org.saveole.grpc.greeting.HelloReply>) responseObserver);
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
          getSayHelloMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.saveole.grpc.greeting.HelloRequest,
              org.saveole.grpc.greeting.HelloReply>(
                service, METHODID_SAY_HELLO)))
        .build();
  }

  private static abstract class GreetingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreetingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.saveole.grpc.greeting.GreetingServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GreetingService");
    }
  }

  private static final class GreetingServiceFileDescriptorSupplier
      extends GreetingServiceBaseDescriptorSupplier {
    GreetingServiceFileDescriptorSupplier() {}
  }

  private static final class GreetingServiceMethodDescriptorSupplier
      extends GreetingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    GreetingServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (GreetingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreetingServiceFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
