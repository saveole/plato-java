package grpc;


import net.devh.boot.grpc.client.inject.GrpcClient;
import org.saveole.grpc.greeting.GreetingServiceGrpc;
import org.saveole.grpc.greeting.HelloRequest;
import org.saveole.grpc.user.GetUserRequest;
import org.saveole.grpc.user.User;
import org.saveole.grpc.user.UserServiceGrpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class ClientController {

    @GrpcClient("grpc-server")
    private GreetingServiceGrpc.GreetingServiceBlockingStub greetingService;

    @GrpcClient("grpc-server")
    private UserServiceGrpc.UserServiceBlockingStub userService;

    @GetMapping("/greeting/{name}")
    public String greeting(@PathVariable("name") String name) {
        return greetingService.sayHello(
                HelloRequest.newBuilder()
                        .setName(name)
                        .build()
        ).getMessage();
    }

    @GetMapping("/user/{id}")
    public String user(@PathVariable("id") String id) {
        return userService.getUser(
                GetUserRequest.newBuilder()
                        .setId(id)
                        .build()
        ).getUser().getName();
    }
}
