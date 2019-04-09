package com.timo.zuul.filter;

import com.alibaba.fastjson.JSONObject;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * @Author: Timo
 * @Date: 2019/4/4 14:50
 * @Description: 第二个测试拦截器
 */
@Component
public class PostPreFilter extends ZuulFilter {

    Logger log = LoggerFactory.getLogger(PostPreFilter.class);

    /**
     * 使用返回值设定Filter类型，可以设置为pre、route、post、巳rror类型。
     * @return
     */
    @Override
    public String filterType() {
        log.info("PostPreFilter filterType is pre");
        return PRE_TYPE;
    }

    /**
     * 使用返回值设定Filter执行次序。
     * @return
     */
    @Override
    public int filterOrder() {
        log.info("PostPreFilter filterOrder is 0");
        return 0;
    }

    /**
     * 使用返回值设定该Filter是否执行，可以作为开关来使用。
     *
     * @return true  / false
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * Filter里面的核心执行逻辑，业务处理在此编写。
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        log.info("PostPreFilter run  这是第零个拦截器运行的方法");
        // 从RequestContext 获取上下文
        RequestContext cxt = RequestContext.getCurrentContext();
        cxt.getResponse().setCharacterEncoding("UTF-8");
        String body = cxt.getResponseBody();
        if (StringUtils.isEmpty(body)) {
            cxt.setResponseStatusCode(500);
            cxt.setResponseBody(body);
        }
        return null;
    }
}
