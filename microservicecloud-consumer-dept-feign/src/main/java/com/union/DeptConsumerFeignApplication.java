package com.union;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description
 * @Author ChengXiang
 * @Date 2019/2/23 14:42
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.union"})
@ComponentScan("com.union")
public class DeptConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeignApplication.class,args);
    }
}
