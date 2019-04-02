package com.timo.eureka.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: Timo
 * @Date: 2019/4/1 09:55
 * @Description: feign 消费者启动
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignHelloConsumerApplication {
    public static void main(String[] args){
        SpringApplication.run(FeignHelloConsumerApplication.class, args);
    }
}
