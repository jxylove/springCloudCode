package com.timo.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Timo
 * @Date: 2019/4/4 09:49
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class ZuulClientCApplication {
    public static void main(String[] args){
        SpringApplication.run(ZuulClientCApplication.class, args);
    }
}
