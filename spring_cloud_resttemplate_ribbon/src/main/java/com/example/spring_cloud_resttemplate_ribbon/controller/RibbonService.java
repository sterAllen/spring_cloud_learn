package com.example.spring_cloud_resttemplate_ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {
    //这儿使用resttmplate作为负载均衡,
    // 这个controller使用resttmplate去进行对生产者的请求,生产同名spring-clound-eureka-producer的
    //服务有两个,在请求的时候通过resttmplate进行负载均衡.
    @Autowired
    RestTemplate restTemplate;
    public String index_ribbon(@RequestParam String name) {
        String tmp =
                restTemplate.getForObject
                        ("http://SPRING-CLOUND-EUREKA-PRODUCER/hello?name="+name,String.class);
        System.out.println(""+tmp);
        return tmp;
    }


}
