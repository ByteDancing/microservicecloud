package com.union;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description
 * @Author ChengXiang
 * @Date 2019/2/23 23:22
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7003Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7003Application.class, args);
    }
}
