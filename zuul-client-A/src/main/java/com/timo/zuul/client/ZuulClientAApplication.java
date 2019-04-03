package com.timo.zuul.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Timo
 * @Date: 2019/4/3 18:01
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class ZuulClientAApplication {
    public static void main(String[] args){
        SpringApplication.run(ZuulClientAApplication.class, args);
    }
}
