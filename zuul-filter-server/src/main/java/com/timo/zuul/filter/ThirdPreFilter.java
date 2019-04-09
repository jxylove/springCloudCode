package com.timo.zuul.filter;

import com.alibaba.fastjson.JSON;
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
public class ThirdPreFilter extends ZuulFilter {

    Logger log = LoggerFactory.getLogger(ThirdPreFilter.class);

    /**
     * 使用返回值设定Filter类型，可以设置为pre、route、post、巳rror类型。
     * @return
     */
    @Override
    public String filterType() {
        log.info("ThirdPreFilter filterType is pre");
        return PRE_TYPE;
    }

    /**
     * 使用返回值设定Filter执行次序。
     * @return
     */
    @Override
    public int filterOrder() {
        log.info("ThirdPreFilter filterOrder is 3");
        return 3;
    }

    /**
     * 使用返回值设定该Filter是否执行，可以作为开关来使用。
     *
     * @return true  / false
     */
    @Override
    public boolean shouldFilter() {
        RequestContext cxt = RequestContext.getCurrentContext();
        boolean isLogin = (boolean) cxt.get("logic-is-success");
        log.info("ThirdPreFilter shouldFilter is "+isLogin);
        return isLogin;
    }

    /**
     * Filter里面的核心执行逻辑，业务处理在此编写。
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        log.info("ThirdPreFilter run  这是第三个拦截器运行的方法");
        // 从RequestContext 获取上下文
        RequestContext cxt = RequestContext.getCurrentContext();
        cxt.getResponse().setCharacterEncoding("UTF-8");
        cxt.getResponse().setContentType("text/html;charset=UTF-8");
        // 从上下文中获取HttpServletRequest
        HttpServletRequest request = cxt.getRequest();
        String b = request.getParameter("b");
        // 如果参数b 为空的话
        if (StringUtils.isEmpty(b)) {
            // 对该请求禁止路由，也就是
            cxt.setSendZuulResponse(false);
//            JSONObject result = new JSONObject();
//            result.put("code",200);
//            result.put("msg", "b参数不能为空");
//            String resultStr = JSON.toJSONString(request);

            cxt.setResponseBody("{\"status\":500,\"message\":\"b参数为空！\"}");
            cxt.set("logic-is-success", false) ;
            return null;
        }

        return null;
    }
}
