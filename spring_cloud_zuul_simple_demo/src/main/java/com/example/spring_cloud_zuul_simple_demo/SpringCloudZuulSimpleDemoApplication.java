package com.example.spring_cloud_zuul_simple_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringCloudZuulSimpleDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZuulSimpleDemoApplication.class, args);
    }

}
