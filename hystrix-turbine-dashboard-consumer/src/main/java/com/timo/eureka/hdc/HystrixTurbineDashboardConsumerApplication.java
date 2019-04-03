package com.timo.eureka.hdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: Timo
 * @Date: 2019/4/3 10:29
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableFeignClients
public class HystrixTurbineDashboardConsumerApplication {
    public static void main(String[] args){
        SpringApplication.run(HystrixTurbineDashboardConsumerApplication.class, args);
    }
}
