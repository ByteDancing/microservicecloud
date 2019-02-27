package com.union.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.union.entity.Dept;
import com.union.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description
 * @Author ChengXiang
 * @Date 2019/2/23 12:12
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService = null;

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") Long id) {

        Dept dept = this.deptService.get(id);
        if (dept == null) {
            throw new RuntimeException("该ID：" + id +"没有响应的对象信息");
        }
        return dept;

    }

    public Dept processHystrix_Get(@PathVariable("id") Long id){
        return new Dept().setDeptno(id).setDname("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand")
                .setDb_source("no this database in MySQL");
    }

}
