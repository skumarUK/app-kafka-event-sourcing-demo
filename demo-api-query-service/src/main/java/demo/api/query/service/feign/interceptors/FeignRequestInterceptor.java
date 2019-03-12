package demo.api.query.service.feign.interceptors;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Service;

@Service
public class FeignRequestInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate requestTemplate){
        requestTemplate.header("Authorization", "");
    }
}
