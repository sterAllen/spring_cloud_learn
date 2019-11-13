package com.example.spring_cloud_eureka_consumer.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/***
 * 消费者通过feign声明式的客户端去远程调用生产者的服务    调用这个微服务中的hello方法（spring_clound_eureka_producer）
 *两个独立的微服务之间调用可以通过这个方法
 */
@FeignClient(name= "SPRING-CLOUND-EUREKA-PRODUCER")//调用的远程服务的微服务名称
public interface HelloService {
    //feign调用实现    feign是一个声明式的webservice客户端。
    //这个方法得和生产者中的方法名称和变量参数名称都保持一致
    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);

}
