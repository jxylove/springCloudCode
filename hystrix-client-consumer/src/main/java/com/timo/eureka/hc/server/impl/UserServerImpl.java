package com.timo.eureka.hc.server.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.timo.eureka.hc.server.UserServer;
import org.springframework.stereotype.Service;

/**
 * @Author: Timo
 * @Date: 2019/4/2 20:20
 * @Description: 用户服务的接口实现类
 */
@Service
public class UserServerImpl implements UserServer {

    @Override
    @HystrixCommand(fallbackMethod = "defaultUser")
    public String getUser(String username) throws Exception {
        if(username.equals("spring")) {
            return "This is real user";
        }else {
            throw new Exception();
        }
    }

    /**
     * 出错则调用该方法返回友好错误
     * @param username
     * @return
     */
    public String defaultUser(String username) {
        return "The user does not exist in this system";
    }
}
