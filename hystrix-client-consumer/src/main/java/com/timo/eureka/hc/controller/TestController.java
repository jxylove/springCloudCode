package com.timo.eureka.hc.controller;

import com.timo.eureka.hc.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	private UserServer userService;
	
	@GetMapping("/getUser")
	public String getUser(@RequestParam String username) throws Exception{
		return userService.getUser(username);
	}
}
