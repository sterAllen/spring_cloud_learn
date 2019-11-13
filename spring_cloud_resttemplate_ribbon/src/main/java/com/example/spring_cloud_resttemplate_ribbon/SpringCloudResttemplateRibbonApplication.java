package com.example.spring_cloud_resttemplate_ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudResttemplateRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudResttemplateRibbonApplication.class, args);
    }

}
