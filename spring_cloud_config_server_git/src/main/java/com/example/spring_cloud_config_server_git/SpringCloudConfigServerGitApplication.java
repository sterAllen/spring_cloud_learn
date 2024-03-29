package com.example.spring_cloud_config_server_git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer

public class SpringCloudConfigServerGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigServerGitApplication.class, args);
    }

}
