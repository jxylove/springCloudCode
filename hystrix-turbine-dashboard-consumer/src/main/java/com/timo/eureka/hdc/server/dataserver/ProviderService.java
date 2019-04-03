package com.timo.eureka.hdc.server.dataserver;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Author: Timo
 * @Date: 2019/4/3 11:02
 * @Description: 服务提供者
 */
@FeignClient(name = "HYSTRIX-TURBINE-DASHBOARD-PROVIDER")
public interface ProviderService {

    @RequestMapping(value = "/getDashboard", method = RequestMethod.GET)
    public List<String> getProviderData();
}
