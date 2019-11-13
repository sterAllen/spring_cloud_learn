package com.example.spring_cloud_eureka_consumer.controller;

import com.example.spring_cloud_eureka_consumer.remote.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 消费者的controller层
 * 测试feigin的流程:
 * consumer消费者controller层--->消费者service层---->消费者service层通过feign远程调用--->producer中的congtoller层
 */
@RestController
public class ConsumerController {
    @Autowired
    public HelloService helloService;
    //http://192.168.XX.XX:9008/hello/allen1111
    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        String tmp = helloService.hello(name);
        System.out.println("--"+tmp);
        return tmp;
    }
}
