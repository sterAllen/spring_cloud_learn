package com.example.eureka_config_client_git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaConfigClientGitApplication {
    //# 在项目 spring_cloud_config_client_git_refresh 的基础上加入了想eureka注册中心进行注册

    public static void main(String[] args) {
        SpringApplication.run(EurekaConfigClientGitApplication.class, args);
    }

}
