package com.union.cfgbean;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @Author ChengXiang
 * @Date 2019/2/23 14:17
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced   //客户端ribbon负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    /**
     * ribbon负载均衡算法演示*/
    @Bean
    public IRule myRule() {
//        return  new RoundRobinRule();   //默认的轮询算法
//        return new RandomRule();    //随机算法
        return new RetryRule(); //指定时间内过滤掉崩溃的服务
    }

}
