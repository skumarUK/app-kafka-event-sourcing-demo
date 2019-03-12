package demo.api.command.service;

import demo.api.command.service.api.config.ItemProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
@EnableWebMvc
@ComponentScan({"demo.api"})
@EnableConfigurationProperties(ItemProperties.class)
@RefreshScope
public class DemoApiCommandApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApiCommandApplication.class, args);
    }
}
