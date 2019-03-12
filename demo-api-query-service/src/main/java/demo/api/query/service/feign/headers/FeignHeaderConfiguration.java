package demo.api.query.service.feign.headers;

import demo.api.query.service.feign.interceptors.FeignRequestInterceptor;
import feign.RequestInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class FeignHeaderConfiguration {

    private FeignRequestInterceptor feignRequestInterceptor;

    @Autowired
    public FeignHeaderConfiguration(FeignRequestInterceptor feignRequestInterceptor){
        this.feignRequestInterceptor = feignRequestInterceptor;
    }

    @Bean
    public RequestInterceptor authRequestInterceptor(){
        return this.feignRequestInterceptor;
    }
}
