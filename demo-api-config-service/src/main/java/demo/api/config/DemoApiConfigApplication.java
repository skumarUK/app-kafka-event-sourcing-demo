package demo.api.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DemoApiConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApiConfigApplication.class, args);
    }

}

