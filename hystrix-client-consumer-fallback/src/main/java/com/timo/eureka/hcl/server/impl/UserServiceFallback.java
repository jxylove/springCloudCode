package com.timo.eureka.hcl.server.impl;

import com.timo.eureka.hcl.server.UserServer;
import org.springframework.stereotype.Component;

@Component
public class UserServiceFallback implements UserServer {
	/**
	  * 出错则调用该方法返回友好错误
	  * @param username
	  * @return
	  */
	@Override
	public String getUser(String username){
		return "The user does not exist in this system, please confirm username";
	}
}
