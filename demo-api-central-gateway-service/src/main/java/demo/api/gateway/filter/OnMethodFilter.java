package demo.api.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class OnMethodFilter extends ZuulFilter {

    private static final Logger log = LoggerFactory.getLogger(OnMethodFilter.class);
    private static final List<String> methodsForCommands = Arrays.asList("POST", "PUT", "PATCH", "DELETE");

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return FilterConstants.PRE_DECORATION_FILTER_ORDER - 1;
    }

    @Override
    public boolean shouldFilter() {

        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        return request.getHeader("Authorization")!=null;
    }

    @Override
    public Object run() {
        final RequestContext ctx = RequestContext.getCurrentContext();
        final String method = ctx.getRequest().getMethod();
        if (isCommand(ctx)) {
            log.info("Resolved incoming request using method {} to service ID 'demo-api-command-service'.", method);
            ctx.set("serviceId","demo-api-command-service");
            ctx.setRouteHost(null);
            ctx.addOriginResponseHeader("X-Zuul-ServiceId", UUID.randomUUID().toString());
        } else {
            log.info("Resolved incoming request using method {} to service ID 'demo-api-query-service'.", method);
            ctx.set("serviceId", "demo-api-query-service");
            ctx.setRouteHost(null);
            ctx.addOriginResponseHeader("X-Zuul-ServiceId", UUID.randomUUID().toString());
        }
        return null;
    }

    private boolean isCommand(final RequestContext ctx) {
        return
                StringUtils.isNotEmpty(ctx.getRequest().getMethod()) &&
                        methodsForCommands.contains(ctx.getRequest().getMethod().toUpperCase());
    }
}
