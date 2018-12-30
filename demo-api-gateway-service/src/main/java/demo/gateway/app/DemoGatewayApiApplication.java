package demo.gateway.app;

import demo.gateway.api.OnMethodFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@EnableSwagger2
public class DemoGatewayApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoGatewayApiApplication.class, args);
    }

    @Bean
    public OnMethodFilter onMethodZuulFilter() {
        return new OnMethodFilter();
    }


}
