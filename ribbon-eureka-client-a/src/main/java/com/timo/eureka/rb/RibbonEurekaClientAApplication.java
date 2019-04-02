package com.timo.eureka.rb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: Timo
 * @Date: 2019/4/1 09:55
 * @Description: 类用途：
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RibbonEurekaClientAApplication {
    public static void main(String[] args){
        SpringApplication.run(RibbonEurekaClientAApplication.class, args);
    }
}
