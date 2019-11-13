package com.example.zuul_demo_hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * zuul中实现熔断 服务降级的功能
 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ZuulDemoHystrixApplication {
    //http://localhost:9027/producer/hello?name=allen&token=mima
    public static void main(String[] args) {
        SpringApplication.run(ZuulDemoHystrixApplication.class, args);
    }

}
