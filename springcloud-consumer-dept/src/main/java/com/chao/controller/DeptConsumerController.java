package com.chao.controller;

import com.chao.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {

    //理解消费者
    //RestTemplate模板
    //(url,实体：map，class<T>,responseType)

    //private static final String url="http://localhost:8001";
    //利用负载均衡实现，我们这里的地址是一个变量，通过服务名来进行访问
    private static final String url="http://springcloud-provider-dept";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("get")
    public List<Dept> get(){
        return restTemplate.getForObject(url+"/list",List.class);
    }

    @RequestMapping("get01/{deptno}")
    public Dept get1(@PathVariable("deptno") Long deptno){
        return restTemplate.getForObject(url+"/get/"+deptno,Dept.class);
    }

    @RequestMapping("get02")
    public boolean get02(Dept dept){
        return restTemplate.postForObject(url+"/add",dept,Boolean.class);
    }
}
