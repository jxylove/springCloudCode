package com.timo.eureka.hc.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Timo
 * @Date: 2019/4/1 17:07
 * @Description: 熔断器的测试
 */
@RestController
public class HystrixController {


    @GetMapping("/test")
    @HystrixCommand(fallbackMethod = "fail")
    public String test() {
        return "request is ok";
    }

    @GetMapping("/test_1")
    @HystrixCommand(fallbackMethod = "fail")
    public String test1() {
        if (true) {
            throw new RuntimeException("运行出错了");
        }
        return "request is ok 1";
    }

    @GetMapping("/test_2")
    @HystrixCommand(fallbackMethod = "fail")
    public String test2() {
        long startTime = System.currentTimeMillis();
        try {
            Thread.sleep(1000*10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println((endTime-startTime)/1000);
        return "request is ok 2 ";
    }

    public String fail(Throwable throwable) {
        return "request is fail"+throwable.getMessage();
    }
}
