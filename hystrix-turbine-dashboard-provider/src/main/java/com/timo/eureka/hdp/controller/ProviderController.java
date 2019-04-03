package com.timo.eureka.hdp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ProviderController {
   
	@Resource
	private ConsumerService consumerService;
	
    @GetMapping("/getDashboard")
    public List<String> getProviderData(){
    	List<String> provider = new ArrayList<String>();
    	provider.add("hystrix dashboard");
        return provider;
    }
    
    
    @GetMapping("/getHelloService")
    public String getHelloService(){
        return consumerService.getHelloServiceData();
    }
}
