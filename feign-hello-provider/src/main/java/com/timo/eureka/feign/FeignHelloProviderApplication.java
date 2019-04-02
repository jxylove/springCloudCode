package com.timo.eureka.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import javax.swing.*;

/**
 * @Author: Timo
 * @Date: 2019/4/1 09:55
 * @Description: 类用途：
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignHelloProviderApplication {
    public static void main(String[] args){
        SpringApplication.run(FeignHelloProviderApplication.class, args);
    }
}
