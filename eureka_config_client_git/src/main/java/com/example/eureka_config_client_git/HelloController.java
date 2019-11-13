package com.example.eureka_config_client_git;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//访问测试地址:http://localhost:9022/getFromServerGit
@RestController
@RefreshScope // 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候
// ，自动将新的配置更新到该类对应的字段中。
public class HelloController {
    @Value("${neo.hello}")
    public String hello;//使用这个注解我们获取从server端拿到的配置文件中的信息

    @RequestMapping(value = "/getFromServerGit")
    public String getServerConfigInfoFromGit() {
        return this.hello;
    }
//    #Spring Cloud Config分服务端和客户端，服务端负责将git（svn）中存储的配置文件发布成REST接口，
//            # 客户端可以从服务端REST接口获取配置。但客户端并不能主动感知到配置的变化，从而主动去获取新的配置。
//            # 客户端如何去主动获取新的配置信息呢，springcloud已经给我们提供了解决方案，
//            # 每个客户端通过POST方法触发各自的/refresh

//    增加了spring-boot-starter-actuator包，spring-boot-starter-actuator是一套监控的功能，可以监控程序在运行时状态，其中就包括/refresh的功能。
//     2、 开启更新机制
//    需要给加载变量的类上面加载@RefreshScope，在客户端执行/refresh的时候就会更新此类下面的变量值。
}
