package com.timo.eureka.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Timo
 * @Date: 2019/4/1 10:32
 * @Description: 配置中心
 */
@Configuration
public class HelloFeignConfig {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
