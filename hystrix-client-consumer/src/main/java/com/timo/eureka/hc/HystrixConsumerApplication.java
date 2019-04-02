package com.timo.eureka.hc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @Author: Timo
 * @Date: 2019/4/1 09:55
 * @Description: 类用途：
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class HystrixConsumerApplication {
    public static void main(String[] args){
        SpringApplication.run(HystrixConsumerApplication.class, args);
    }
}
