package com.timo.zuul.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Timo
 * @Date: 2019/4/3 18:05
 * @Description: 测试控制器
 */
@RestController
public class TestController {


    @GetMapping("/add")
    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    @GetMapping("/hello")
    public String hello(Integer a, Integer b) {
        return "HI ZUUL CLIENT A";
    }

}
