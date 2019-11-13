package com.example.spring_cloud_feign_hystrix.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/***
 * --add:在使用feign的基础上加上熔断器的功能
 * 消费者通过feign声明式的客户端去远程调用生产者的服务
 * 调用这个微服务中的hello方法（spring_clound_eureka_producer）
 *两个独立的微服务之间调用可以通过这个方法
 */
@Primary //不加这个注解的话 idea提示有两个bean（不影响程序运行）使用@primary可干掉此提示
@FeignClient(name= "SPRING-CLOUND-EUREKA-PRODUCER",fallback=HelloRemoteHystrix.class)//服务熔断返回fallback
public interface HelloService {
    //feign调用实现    feign是一个声明式的webservice客户端。
    //这个方法得和生产者中的方法名称和变量参数名称都保持一致
    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);

}
