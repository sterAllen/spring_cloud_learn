package com.example.spring_cloud_feign_hystrix.remote;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

/**
 * 对任意的class的中的方法进行熔断处理
 * 基于某个方法的熔断测试
 * ---不能这么测试 一般是针对服务或者接口建调用的时候进行熔断,服务内部方法调用出现异常，直接抛出异常就行了，
 * 不用进行熔断处理
 */
@Component
public class CommonHystrixTest {
    //ElementType.METHOD   这个注解在方法上面使用
    @HystrixCommand(fallbackMethod ="fallbackError")
    public String testCommndMethod(String name){
        try{
            int a = 1/0;
        }catch (Exception e){
            throw new RuntimeException("异常了");
        }
        return "这个是没有熔断处理前返回的值"+name;
    }
    //触发熔断时候调用的回调方法
    public String fallbackError(String name){
        return "sorry,"+name+"is error，触发了熔断方法 进行服务降级";
    }
}
