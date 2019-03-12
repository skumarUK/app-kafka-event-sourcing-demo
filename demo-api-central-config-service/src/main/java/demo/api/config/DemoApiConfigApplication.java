package demo.api.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class DemoApiConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApiConfigApplication.class, args);
    }

}

