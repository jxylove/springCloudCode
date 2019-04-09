package com.timo.zuul.filter;

import com.alibaba.fastjson.JSONObject;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.ZuulFilterResult;
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
public class SecondPreFilter extends ZuulFilter {

    Logger log = LoggerFactory.getLogger(SecondPreFilter.class);

    /**
     * 使用返回值设定Filter类型，可以设置为pre、route、post、巳rror类型。
     * @return
     */
    @Override
    public String filterType() {
        log.info("SecondPreFilter filterType is pre");
        return PRE_TYPE;
    }

    /**
     * 使用返回值设定Filter执行次序。
     * @return
     */
    @Override
    public int filterOrder() {
        log.info("SecondPreFilter filterOrder is 2");
        return 2;
    }

    /**
     * 使用返回值设定该Filter是否执行，可以作为开关来使用。
     *
     * @return true  / false
     */
    @Override
    public boolean shouldFilter() {
        log.info("SecondPreFilter shouldFilter is true");
        return true;
    }

    /**
     * Filter里面的核心执行逻辑，业务处理在此编写。
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        log.info("SecondPreFilter run  这是第二个拦截器运行的方法");
        // 从RequestContext 获取上下文
        RequestContext cxt = RequestContext.getCurrentContext();
        cxt.getResponse().setCharacterEncoding("UTF-8");
        cxt.getResponse().setContentType("text/html;charset=UTF-8");
        // 从上下文中获取HttpServletRequest
        HttpServletRequest request = cxt.getRequest();
        String a = request.getParameter("a");
        // 如果参数a 为空的话
        if (StringUtils.isEmpty(a)) {
            // 对该请求禁止路由，也就是
            cxt.setSendZuulResponse(false);
//            JSONObject result = new JSONObject();
//            result.put("code",200);
//            result.put("msg", "a参数不能为空");
            cxt.setResponseBody("{\"status\":500,\"message\":\"a参数为空！\"}");
            cxt.set("logic-is-success", false) ;

            return null;
        }
        cxt.set("logic-is-success", true);
        return null;
    }
}
