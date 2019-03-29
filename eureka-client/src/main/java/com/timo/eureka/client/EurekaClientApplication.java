package com.timo.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @Author: timo
 * @Date: 2019/3/29 17:34
 * @Description: 这里是eureka Client 的启动类
 *
 * @EnableEurekaClient 声明这个项目是 client
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

}
