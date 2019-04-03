package com.timo.eureka.hdp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: Timo
 * @Date: 2019/4/3 10:23
 * @Description: 启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableFeignClients
public class HystrixDashboardProviderApplication {
    public static void main(String[] args){
        SpringApplication.run(HystrixDashboardProviderApplication.class, args);
    }
}
