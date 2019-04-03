package com.timo.eureka.hcl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author: Timo
 * @Date: 2019/4/2 20:36
 * @Description: 启动类
 */
@SpringBootApplication
@EnableHystrix
@EnableDiscoveryClient
@EnableFeignClients
public class HystrixClientConsumerFallbackApplication {
    public static void main(String[] args){
        SpringApplication.run(HystrixClientConsumerFallbackApplication.class, args);
    }
}
