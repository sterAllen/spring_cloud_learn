package com.example.spring_clound_eureka_producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
//生产者   作为客户端把服务注册到eureka注册中心
public class SpringCloundEurekaProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloundEurekaProducerApplication.class, args);
    }

}
