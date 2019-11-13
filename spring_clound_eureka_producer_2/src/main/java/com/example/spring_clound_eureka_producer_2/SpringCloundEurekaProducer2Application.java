package com.example.spring_clound_eureka_producer_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloundEurekaProducer2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloundEurekaProducer2Application.class, args);
    }

}
