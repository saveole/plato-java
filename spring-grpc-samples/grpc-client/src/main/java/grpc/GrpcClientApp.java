package grpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GrpcClientApp {

    public static void main(final String... args) {
        SpringApplication.run(GrpcClientApp.class, args);
    }
}
