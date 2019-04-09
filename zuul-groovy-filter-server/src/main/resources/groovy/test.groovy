package groovy

import com.netflix.zuul.ZuulFilter
import com.netflix.zuul.context.RequestContext
import com.netflix.zuul.exception.ZuulException

import javax.servlet.http.HttpServletRequest

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE

class test extends ZuulFilter{

    @Override
    public String filterType() {
        return PRE_TYPE
    }

    @Override
    public int filterOrder() {
        return 6
    }

    @Override
    public boolean shouldFilter() {
        return true
    }

    @Override
    public Object run() throws ZuulException {
        HttpServletRequest request = RequestContext.currentContext.request as HttpServletRequest
        Iterator headerIt = request.getHeaderNames().iterator()
        while (headerIt.hasNext()) {
            String name = (String) headerIt.next()
            String value = request.getHeader(name)
            println("test: " + name + " : " + value)
        }
        println("This is Groovy Filter!")
        return null
    }
}
