package com.example.spring_cloud_feign_hystrix.remote;

import org.springframework.stereotype.Component;

/***
 * feigin之上触发熔断器之后调用该服务
 */
@Component
public class HelloRemoteHystrix   implements  HelloService{
    @Override
    public String hello(String name) {
        return "hello" +name+", this messge send failed---熔断处理了 ";
    }
}
