### SpringCloud 

####    一，从面试题目开始


####    二、

####    三、

####    四、

####    五、

####    六、
#####   1> Eureka集群高可用配置
1,修改host文件-映射  
 
    `127.0.0.1       eureka7001.com
     127.0.0.1       eureka7002.com
     127.0.0.1       eureka7003.com	`
         
2,创建集群项目mudule

     ` <module>microservicecloud-eureka-7001</module>
       <module>microservicecloud-eureka-7002</module>
       <module>microservicecloud-eureka-7003</module>`  
3,修改yml文件
    `server:
       port: 7001
     
    
     eureka:
       instance:
         hostname: eureka7001.com
     # 单机   hostname: localhost       #eureka服务端的实例名称-单机
       client:
         register-with-eureka: false     #false 7001不向服务中心注册自己
         fetch-registry: false           #false 表示自己就是注册中心，我的职责就是维护服务实例，并不需要检索服务
         service-url:
     # 单机     defaultZone: http://${eureka.instance.hostname}:${server.port}/eureka/       #设置Eureka Server交互的地址查询服务和注册服务都需要依赖这个地址
            defaultZone: http://eureka7002.com:7002/eureka/,http://eureka7003.com:7003/eureka/`

4,测试

    访问，其余eureka7001.com，eureka7002.com均可见
    http://eureka7003.com:7003/

#####   2>eureka和zookeeper的对比
   
   传统的ACID
   
    A(Atomistic):原子性
    C(Consistency):一致性
    I(Isolation):独立性
    D(Durability):持久性
    
   经典的CAP
   
   `C：强一致性
   A：可用性
   P：分区一致性
   `
   
   zookeeper保证的是CP
   Eureka保证的是AP
    
    
    
####    六、Ribbon负载均衡
Spring Cloud Ribbon是基于Netflix Ribbon的**客户端** 负载均衡工具；
    主要功能是提供**客户端软件负载均衡的算法**


#### 七、Feign负载均衡
    Feign是通过接口的方式调用Rest服务（之前是Ribbon+RestTemplate）
    
####    八、Hystrix断路器
    Hystrix是一个处理分布式系统的延迟和容错的开开源库，在分布式系统里，许多依赖不可避免的
    调用失败，比如超时，异常；
    而Hystrix能够保证一个依赖出现问题后，不会使整个微服务失败，避免级联故障；以提高分布式的弹性
    
    
    
####    九、Zuul路由网关
    zuul与eureka组合，自身注册为Eureka服务治理下的应用，其他的微服务访问通过Zuul跳转后获得；
    `
    #配置规则
    zuul: 
       #ignored-services: microservicecloud-dept
       prefix: /atguigu         #设置前缀
       ignored-services: "*"    #隐藏所有
       routes: 
         mydept.serviceId: microservicecloud-dept
         mydept.path: /mydept/**
    `
####    十、Springcloud config配置管理