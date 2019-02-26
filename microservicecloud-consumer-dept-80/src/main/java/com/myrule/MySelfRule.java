package com.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 自定义Ribbon的负载均衡策略，此类不可以与主启动类同包或其子包下
 * @Author ChengXiang
 * @Date 2019/2/26 21:37
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        //return new RandomRule();    //默认为轮询，修改为随机
        //return new RoundRobinRule();//轮询，一次

        /**自定义轮询次数为5次*/
        return new RandomRule_ZY();
    }
}
