package com.example.spring_cloud_resttemplate_hystrix_dashborad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrix
@EnableDiscoveryClient
@EnableHystrixDashboard
public class SpringCloudResttemplateHystrixDashboradApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudResttemplateHystrixDashboradApplication.class, args);
    }

}
