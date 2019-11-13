package com.example.zuul_self_filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * 使用zuul做路由请求转发
 * 在做网关代理的时候加入了自定义的过滤器，我们在在这个过滤器中加入自己的一些验证之类的
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ZuulSelfFilterApplication {
//#本微服务的测试端口: http://localhost:9026/producer/hello?name=allen
// http://localhost:9026/producer/hello?name=allen&token=mima
    public static void main(String[] args) {
        SpringApplication.run(ZuulSelfFilterApplication.class, args);
    }
    @Bean
    public TokenFilter tokenFilter() {
        return new TokenFilter();
    }

}
