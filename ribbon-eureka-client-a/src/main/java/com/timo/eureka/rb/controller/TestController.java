package com.timo.eureka.rb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.xml.transform.Result;

/**
 * @Author: Timo
 * @Date: 2019/4/1 11:41
 * @Description: 测试Ribbon客户端
 */
@RestController
public class TestController {

    @GetMapping("/add")
    public String add(Integer a, Integer b, HttpServletRequest request) {
        return "From Port "+request.getServerPort()+ ",  Result"+(a+b) ;
    }
}

