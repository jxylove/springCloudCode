package com.timo.eureka.hcl.server;

import com.timo.eureka.hcl.server.impl.UserServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: Timo
 * @Date: 2019/4/2 20:19
 * @Description: 定义用户服务接口
 */
@FeignClient(name = "HYSTRIX-PROVIDER", fallback = UserServiceFallback.class)
public interface UserServer {

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public String getUser(@RequestParam("username") String username) throws Exception;
}
