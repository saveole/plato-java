package grpc.user;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.saveole.grpc.user.GetUserRequest;
import org.saveole.grpc.user.GetUserResponse;
import org.saveole.grpc.user.User;
import org.saveole.grpc.user.UserServiceGrpc;

@GrpcService
public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {

    @Override
    public void getUser(GetUserRequest request, StreamObserver<GetUserResponse> responseObserver) {
        System.out.println("UserService 服务端收到请求: " + request.getId());
        User mockUser = User.newBuilder()
                .setId(request.getId())
                .setName("张三")
                .setEmail("<EMAIL>")
                .addPhoneNumbers("13845678976")
                .build();
        GetUserResponse user = GetUserResponse.newBuilder()
                .setUser(mockUser)
                .build();
        responseObserver.onNext(user);
        responseObserver.onCompleted();
    }
}
