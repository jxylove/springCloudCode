package com.timo.zuul;

import com.timo.zuul.filter.SecondPreFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
@ServletComponentScan
public class ZuulFilterServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulFilterServerApplication.class, args);
    }





}
