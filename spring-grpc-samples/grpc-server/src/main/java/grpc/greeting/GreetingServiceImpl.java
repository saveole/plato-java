package grpc.greeting;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.saveole.grpc.greeting.GreetingServiceGrpc;
import org.saveole.grpc.greeting.HelloReply;
import org.saveole.grpc.greeting.HelloRequest;

@GrpcService
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
