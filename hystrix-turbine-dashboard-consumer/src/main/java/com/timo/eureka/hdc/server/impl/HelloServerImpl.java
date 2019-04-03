package com.timo.eureka.hdc.server.impl;

import com.timo.eureka.hdc.server.HelloServer;
import com.timo.eureka.hdc.server.dataserver.ProviderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Timo
 * @Date: 2019/4/3 11:02
 * @Description: 类用途：
 */
@Service
public class HelloServerImpl implements HelloServer {

    @Resource
    private ProviderService providerService;

    @Override
    public List<String> getProviderData() {
        return providerService.getProviderData();
    }
}
