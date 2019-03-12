package demo.api.gateway;

import demo.api.gateway.filter.ErrorFilter;
import demo.api.gateway.filter.OnMethodFilter;
import demo.api.gateway.filter.PostFilter;
import demo.api.gateway.filter.PreFilter;
import demo.api.gateway.filter.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class DemoGatewayApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoGatewayApiApplication.class, args);
    }

    @Bean
    public OnMethodFilter onMethodZuulFilter() {
        return new OnMethodFilter();
    }

    @Bean
    public PreFilter onPreFilter() {
        return new PreFilter();
    }

    @Bean
    public PostFilter onPostFilter() {
        return new PostFilter();
    }

    @Bean
    public RouteFilter onRouteFilter() {
        return new RouteFilter();
    }

    @Bean
    public ErrorFilter onErrorFilter() {
        return new ErrorFilter();
    }
}
