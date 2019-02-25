package com.union.cfgbean;

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
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
