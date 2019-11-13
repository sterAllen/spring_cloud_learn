package com.example.zuul_demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ZuulDemo2Application {
//#本微服务的测试端口: http://localhost:9025/producer/hello?name=allen

    public static void main(String[] args) {
        SpringApplication.run(ZuulDemo2Application.class, args);
    }
}
