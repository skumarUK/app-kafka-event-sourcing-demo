package demo.api.query.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@RefreshScope
@EnableEurekaClient
@EnableFeignClients
@EnableSwagger2
@EnableWebMvc
@ComponentScan({"demo.api"})
@EntityScan({"demo.api.common.domain"})
@EnableJpaRepositories({"demo.api.query.domain"})
public class DemoAPIQueryApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoAPIQueryApplication.class, args);
    }
}
