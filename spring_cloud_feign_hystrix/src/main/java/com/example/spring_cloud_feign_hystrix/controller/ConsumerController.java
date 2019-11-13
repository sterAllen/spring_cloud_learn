package com.example.spring_cloud_feign_hystrix.controller;

import com.example.spring_cloud_feign_hystrix.remote.CommonHystrixTest;
import com.example.spring_cloud_feign_hystrix.remote.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * ---add :在原来使用feign进行远程连接的基础上加上了hytrix熔断器的功能
 * 消费者的controller层
 * 测试feigin的流程:
 * consumer消费者controller层--->消费者service层---->消费者service层通过feign远程调用--->producer中的congtoller层
 */
@RestController
public class ConsumerController {
    @Autowired
    public HelloService helloService;//idea提示有两个Bean（不影响程序运行）使用@primary可干掉此提示
    //http://192.168.XX.XX:9013/hello/allen1111
    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        String tmp = helloService.hello(name);
        System.out.println("--"+tmp);
        return tmp;
    }

    /**
     * 不能这么测试 一般是针对服务或者接口建调用的时候进行熔断,服务内部方法调用出现异常，直接抛出异常就行了，
     *  不用进行熔断
     */
    @Autowired
    CommonHystrixTest commonHystrixTest;
    //调用service层的普通方法看是否能实现熔断器的处理
    //http://192.168.XX.XX:9013/common_method?name=zhangsan
    @RequestMapping(value="/common_method",method = RequestMethod.GET)
    public String testCommndMethod(@RequestParam String name){
        String tmp = commonHystrixTest.testCommndMethod(name);
        System.out.println("--"+tmp);
        return tmp;
    }
}
