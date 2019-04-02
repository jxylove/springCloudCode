package com.timo.eureka.rbl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: Timo
 * @Date: 2019/4/1 09:55
 * @Description: 负债均衡策列启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RibbonLoadbalancerAApplication {
    public static void main(String[] args){
        SpringApplication.run(RibbonLoadbalancerAApplication.class, args);
    }


}
