package com.timo.zuul.groovy

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.*;

import javax.servlet.http.HttpServletRequest

import com.netflix.zuul.ZuulFilter
import com.netflix.zuul.context.RequestContext
import com.netflix.zuul.exception.ZuulException

class GroovyFilter extends ZuulFilter {

	@Override
	public String filterType() {
		return PRE_TYPE
	}
	
	@Override
	public int filterOrder() {
		return 10
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
			println("headers: " + name + " : " + value)
		}
		println("This is Groovy Filter!")
		return null
	}
}
