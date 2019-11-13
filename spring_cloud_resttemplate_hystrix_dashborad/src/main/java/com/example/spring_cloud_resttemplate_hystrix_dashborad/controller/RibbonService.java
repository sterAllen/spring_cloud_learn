package com.example.spring_cloud_resttemplate_hystrix_dashborad.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

/***
 * 本案例在spring_cloud_resttemplate_ribbon的基础之上加上了熔断器的功能
 * 在使用resttemplate进行请求调用负载均衡的基础上加上了熔断器的功能
 */
@Service
public class RibbonService {
    //这儿使用resttmplate作为负载均衡,
    // 这个controller使用resttmplate去进行对生产者的请求,生产同名spring-clound-eureka-producer的服务有两个,在请求的时候通过resttmplate进行负载均衡.
    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod="fallbackError")
    public String index_ribbon(@RequestParam String name) {
        String tmp =
                restTemplate.getForObject
                        ("http://SPRING-CLOUND-EUREKA-PRODUCER/hello?name="+name,String.class);
        System.out.println(""+tmp);
        return tmp;
    }
    //触发熔断时候调用的回调方法
    public String fallbackError(String name){
        return "sorry,"+name+"is error!";
    }


}
