package com.timo.eureka.hc.server;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author: Timo
 * @Date: 2019/4/2 20:19
 * @Description: 定义用户服务接口
 */
@FeignClient(name = "HYSTRIX-PROVIDER")
public interface UserServer {
    public String getUser(String username) throws Exception;
}
