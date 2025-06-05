package grpc;

import net.devh.boot.grpc.client.interceptor.GrpcGlobalClientInterceptor;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class GlobalInterceptorConfiguration {

    @GrpcGlobalClientInterceptor
    LogGrpcInterceptor logGrpcInterceptor() {
        return new LogGrpcInterceptor();
    }
}
