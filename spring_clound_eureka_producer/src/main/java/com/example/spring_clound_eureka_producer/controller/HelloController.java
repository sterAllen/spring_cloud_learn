package com.example.spring_clound_eureka_producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //客户端 生产者
    // 请求测试服务地址:http://192.168.xx.xx:9006/hello?name=Allen
    @RequestMapping(path="/hello")
    public String index(@RequestParam String name) {
        return "hello "+name+"，this is producer1  messge";
    }

}
