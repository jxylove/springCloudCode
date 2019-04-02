package com.timo.eureka.rbl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Timo
 * @Date: 2019/4/1 11:54
 * @Description: 类用途：
 */
@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient client;

    @GetMapping("/add")
    public String add(Integer a, Integer b) {
        String result = restTemplate
                .getForObject("http://RIBBON-EUREKA-CLIENT-A/add?a=" + a + "&b=" + b, String.class);
        System.out.println(result);
        return result;
    }


}
