### SpringCloud 

####    一，从面试题目开始


####    二、

####    三、

####    四、

####    五、

####    六、
#####   Eureka集群高可用配置
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


####    七、



