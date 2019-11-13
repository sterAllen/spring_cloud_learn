package com.nuc.spring_cloud_eureka_three_server_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaThreeServer1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaThreeServer1Application.class, args);
    }

}
