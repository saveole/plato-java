package org.saveole.grpc.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import org.saveole.grpc.GreetingServiceGrpc;
import org.saveole.grpc.HelloReply;
import org.saveole.grpc.HelloRequest;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GreetingClient {

    private static final Logger logger = Logger.getLogger(GreetingClient.class.getName());

    private final ManagedChannel channel;
    // 同步存根
    private final GreetingServiceGrpc.GreetingServiceBlockingStub blockingStub;

    // 异步存根 (返回 Future)
    // private final GreeterServiceGrpc.GreeterServiceFutureStub futureStub;

    // 异步存根 (用于流式)
    // private final GreeterServiceGrpc.GreeterServiceStub asyncStub;

    public GreetingClient(String host, int port) {
        // 创建一个到服务端的 Channel
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext() // 开发时使用，生产环境应使用 TLS/SSL
                .build();

        // 基于 Channel 创建不同类型的存根
        blockingStub = GreetingServiceGrpc.newBlockingStub(channel);

        // futureStub = GreeterServiceGrpc.newFutureStub(channel);

        // asyncStub = GreeterServiceGrpc.newStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    /**
     * 调用 SayHello RPC 方法 (同步)
     */
    public void greet(String name) {
        logger.info("客户端尝试问候 " + name + " ...");
        HelloRequest request = HelloRequest.newBuilder().setName(name).build();
        HelloReply response;
        try {
            response = blockingStub.sayHello(request); // 直接调用 RPC 方法
            logger.info("来自服务端的问候: " + response.getMessage());
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC 调用失败: {0}", e.getStatus());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        GreetingClient client = new GreetingClient("localhost", 50051); // 连接到服务端地址和端口
        try {
            String user = "World";
            if (args.length > 0) {
                user = args[0]; /* Use the arg as the name to greet if provided */
            }
            client.greet(user);

            client.greet("Java Developer");
        } finally {
            client.shutdown();
        }
    }
}
