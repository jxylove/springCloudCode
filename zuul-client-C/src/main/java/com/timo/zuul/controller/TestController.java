package com.timo.zuul.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Timo
 * @Date: 2019/4/4 09:50
 * @Description: 类用途：
 */
@RestController
public class TestController {

    @Value("${server.port}")
    private String port ;

    @GetMapping("/test")
    public String test() {
        return "port is :" + port;
    }
}
