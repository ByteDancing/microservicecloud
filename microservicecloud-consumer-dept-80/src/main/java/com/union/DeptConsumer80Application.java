package com.union;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description
 * @Author ChengXiang
 * @Date 2019/2/23 14:42
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer80Application {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80Application.class,args);
    }
}
