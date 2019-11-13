package com.example.eureka_config_server_git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class EurekaConfigServerGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConfigServerGitApplication.class, args);
    }

}
