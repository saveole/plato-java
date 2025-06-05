package org.saveole.grpc.server;

import io.grpc.stub.StreamObserver;
import org.saveole.grpc.GreetingServiceGrpc;
import org.saveole.grpc.HelloReply;
import org.saveole.grpc.HelloRequest;

public class GreetingServiceImpl extends GreetingServiceGrpc.GreetingServiceImplBase {

    @Override
    public void sayHello(HelloRequest request,
                         StreamObserver<HelloReply> responseObserver) {
        System.out.println("服务端收到请求: " + request.getName());
        HelloReply reply = HelloReply.newBuilder().setMessage("Hello " + request.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
