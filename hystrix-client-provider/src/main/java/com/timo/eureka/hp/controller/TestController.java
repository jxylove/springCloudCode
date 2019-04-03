package com.timo.eureka.hp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Timo
 * @Date: 2019/4/2 20:41
 * @Description: 类用途：
 */
@RestController
public class TestController {

    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public String getUser(@RequestParam("username") String username){
        if ("timolove".equals(username)) {
            throw new RuntimeException("抛异常");
        }
        return "This is real usersssssssssssssss";
    }
}
