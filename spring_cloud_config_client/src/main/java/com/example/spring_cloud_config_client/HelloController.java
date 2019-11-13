package com.example.spring_cloud_config_client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 访问测试地址:localhost:9004/getConfigServerFoo    ？？？？？？
 * 读取了config-server服务下面sharded目录下的配置文件中的端口作为本工程启动的端口
 * 使用远程的的属性初始化该服务
 */
@RestController
class HelloController {
    @Value("${foo}")
    private String foo;

    @RequestMapping("/getConfigServerFoo")
    public String getConfigServerFoo() {
        return this.foo;
    }
}
