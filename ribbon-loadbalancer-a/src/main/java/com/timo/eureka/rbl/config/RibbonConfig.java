package com.timo.eureka.rbl.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


/**
 * @Author: Timo
 * @Date: 2019/4/1 11:50
 * @Description: 负载均衡配置类
 * <p>
 * <p>
 * <p>
 * <p>
 * 1.随机策略(RandomRule) ： 随机选择server<br>
 * 2.轮询策略（RoundRobinRule ）：按顺序循环选择server<br>
 * 3.重试策略（Retry Rule）：在一个配置时间段内当选择server不成功，则一直尝试一个可用的server<br>
 * 4.最低并发策略（BestAvailableRule ）：逐个考察server，如果server断路器打开，则忽略，在选择其中并发连接低的server<br>
 * 5.可用过滤策略（AvailabilityFilteringRule ）：过滤掉一直连接失败并标记为 circuit tripped 的 server，过滤掉的那些高并发连接的server (active connections 超过配置的阀值）<br>
 * 6.响应时间加权策略（ResponseTimeWeightedRule ）：根据server的响应时间分配权重。响应时间越长，权重越低，被选择到的概率就越低；响应时间越短，权重越高，被选择到的概率就越高。这个策略很贴切，，综合了各种因素，如网络、磁盘、IO、等，这些因素直接影响着响应时间<br>
 * 7.区域权衡策略（ZoneAvoidanceRule ）：综合判断server所在区域和server的可用性轮询选择server，并且判定一个AWS Zone的运行性能是否可用，剔除不可用的Zone中的所有server<br>
 */
@Configuration
public class RibbonConfig {


    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


    /**
     * 随机策略
     * @return
     */
    @Bean
    public IRule randomIRule() {
        return new RandomRule();
    }
}
