package com.union;

import com.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Description
 * @Author ChengXiang
 * @Date 2019/2/23 14:42
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MySelfRule.class) //在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效
public class DeptConsumer80Application {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80Application.class,args);
    }
}
