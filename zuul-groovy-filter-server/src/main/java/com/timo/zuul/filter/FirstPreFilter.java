package com.timo.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * @Author: Timo
 * @Date: 2019/4/4 14:50
 * @Description: 第一个测试拦截器
 */
@Component
public class FirstPreFilter extends ZuulFilter {

    private Logger log = LoggerFactory.getLogger(FirstPreFilter.class);

    /**
     * 使用返回值设定Filter类型，可以设置为pre、route、post、巳rror类型。
     * @return
     */
    @Override
    public String filterType() {
        log.info("FirstPreFilter filterType is pre");
        return PRE_TYPE;
    }

    /**
     * 使用返回值设定Filter执行次序。
     * @return
     */
    @Override
    public int filterOrder() {
        log.info("FirstPreFilter filterOrder is 1");
        return 1;
    }

    /**
     * 使用返回值设定该Filter是否执行，可以作为开关来使用。
     *
     * @return true  / false
     */
    @Override
    public boolean shouldFilter() {
        log.info("FirstPreFilter shouldFilter is true");
        return true;
    }

    /**
     * Filter里面的核心执行逻辑，业务处理在此编写。
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        log.info("FirstPreFilter run  这是第一个拦截器运行的方法");
        return null;
    }


}
