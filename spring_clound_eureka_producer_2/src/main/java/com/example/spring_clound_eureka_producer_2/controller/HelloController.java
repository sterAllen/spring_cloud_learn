package com.example.spring_clound_eureka_producer_2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //这个工程的代码内容和 spring_clound_eureka_producer工程的代码一样,和这个工程配合测试负载均衡的问题
    //spring_cloud_eureka_consumer消费者通过feign进行请求的时候会发现有两个 spring_clound_eureka_producer 同名服务,
    //这个时候eureka注册中心会通过负载均衡转发请求,请求轮询等转发到这两个服务生产者上面
    //客户端 生产者
    // 请求测试服务地址:http://192.168.xx.xx:9006/hello?name=Allen
    @RequestMapping(path="/hello")
    public String index(@RequestParam String name) {
        return "hello "+name+"，this is producer2  messge";
    }

}
