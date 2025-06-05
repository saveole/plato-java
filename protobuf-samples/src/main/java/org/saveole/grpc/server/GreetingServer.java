package org.saveole.grpc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class GreetingServer {

    private Server server;
    private final int port;

    public GreetingServer(int port) {
        this.port = port;
    }

    public void start() throws IOException {
        server = ServerBuilder.forPort(port)
                .addService(new GreetingServiceImpl())
                .build()
                .start();
        System.out.println("Server started, listening on " + port);

        // JVM 关闭钩子，用于优雅关闭服务器
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("*** shutting down gRPC server since JVM is shutting down");
            try {
                GreetingServer.this.stop();
            } catch (InterruptedException e) {
                e.printStackTrace(System.err);
            }
            System.err.println("*** server shut down");
        }));
    }

    private void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        GreetingServer server = new GreetingServer(50051); // 指定服务端口
        server.start();
        server.blockUntilShutdown(); // 阻塞主线程，直到服务器关闭
    }
}
