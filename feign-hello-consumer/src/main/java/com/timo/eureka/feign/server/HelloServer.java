package com.timo.eureka.feign.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Timo
 * @Date: 2019/4/1 10:06
 * @Description: 注入服务提供者的api
 *
 * @FeignClient(name = "FEIGN-HELLO-PROVIDER") 表示是在注册中心中的服务提供者的 注册名称
 *
 */
@FeignClient(name = "FEIGN-HELLO-PROVIDER")
public interface HelloServer {

    /**
     * 这里的接口路径要和服务提供者的api路径要一致
     * @return
     */
    @RequestMapping("/hello_1")
    public String hello_1();
}
