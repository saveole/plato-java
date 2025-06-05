package org.saveole;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka cloud discovery server application.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApp {

    /**
     * Starts the Eureka cloud discovery server application.
     *
     * @param args The arguments to pass to the application.
     */
    public static void main(final String... args) {
        SpringApplication.run(EurekaServerApp.class, args);
    }

}
