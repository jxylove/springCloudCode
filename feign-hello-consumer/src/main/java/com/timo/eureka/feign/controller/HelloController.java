package com.timo.eureka.feign.controller;

import com.timo.eureka.feign.server.HelloServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: Timo
 * @Date: 2019/4/1 09:58
 * @Description: hello 消费端
 */
@RestController
public class HelloController {

    @Resource
    private HelloServer helloServer;

    @GetMapping("/test_1")
    public String hello() {
       return helloServer.hello_1();
    }
}
