package com.timo.eureka.feign.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Timo
 * @Date: 2019/4/1 09:58
 * @Description: hello 消费端
 */
@RestController
public class HelloController {

    @GetMapping("/hello_1")
    public String hello() {
        return "hello one test";
    }
}
