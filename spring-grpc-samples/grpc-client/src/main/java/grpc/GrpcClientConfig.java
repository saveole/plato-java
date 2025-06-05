package grpc;

import io.grpc.ManagedChannel;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.saveole.grpc.greeting.GreetingServiceGrpc;
import org.saveole.grpc.user.UserServiceGrpc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class GrpcClientConfig {

    // 使用服务名称调用
    // @GrpcClient("grpc-server")
    private ManagedChannel channel;

    // @Bean
    public GreetingServiceGrpc.GreetingServiceBlockingStub greetingServiceBlockingStub() {
        return GreetingServiceGrpc.newBlockingStub(channel);
    }

    // @Bean
    public UserServiceGrpc.UserServiceBlockingStub  userServiceBlockingStub() {
        return UserServiceGrpc.newBlockingStub(channel);
    }
}
