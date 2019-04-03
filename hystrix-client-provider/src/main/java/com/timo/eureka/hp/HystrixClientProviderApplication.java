package com.timo.eureka.hp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: Timo
 * @Date: 2019/4/2 20:28
 * @Description: 启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
public class HystrixClientProviderApplication {
    public static void main(String[] args){
        SpringApplication.run(HystrixClientProviderApplication.class, args);
    }
}
