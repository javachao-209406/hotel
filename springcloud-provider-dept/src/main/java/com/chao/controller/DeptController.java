package com.chao.controller;

import com.chao.pojo.Dept;
import com.chao.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//提供restful服务！
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

//    //获取一些配置的信息，得到一些具体的微服务
//    @Autowired
//    private DiscoveryClient client;

    @PostMapping("add")
    public boolean addDept(Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping("get/{deptno}")
    public Dept queryId(@PathVariable("deptno") Long deptno){
        return deptService.queryId(deptno);
    }

    @GetMapping("list")
    public List<Dept> queryAll(){
        return deptService.allDept();
    }

//    //注册进来的微服务，获取一些信息
//    public Object discovery(){
//        List<String> services = client.getServices();
//        System.out.println(services);
//
//        //得到一个具体的微服务信息
//        List<ServiceInstance> instances = client.getInstances("springcloud-provider-dept");
//        for (ServiceInstance instance : instances) {
//            System.out.println(instance.getHost());
//        }
//        return this.client;
//    }
}
