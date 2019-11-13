package com.example.eureka_config_server_git_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class EurekaConfigServerGit2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConfigServerGit2Application.class, args);
    }

}
