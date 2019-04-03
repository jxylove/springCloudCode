package com.timo.eureka.hdc.controller;

import com.timo.eureka.hdc.server.HelloServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Timo
 * @Date: 2019/4/3 10:54
 * @Description: 类用途：
 */
@RestController
public class HelloController {
    @Resource
    private HelloServer helloServer;

    @GetMapping("/getProviderData")
    public List<String> getProviderData(){
        return helloServer.getProviderData();
    }

    /**
     *
     * @return
     */
    @RequestMapping(value = "/helloService", method = RequestMethod.GET)
    public String getHelloServiceData() {
        return "hello Service";
    }
}
