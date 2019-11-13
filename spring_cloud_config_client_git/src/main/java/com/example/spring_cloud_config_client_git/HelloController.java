package com.example.spring_cloud_config_client_git;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${neo.hello}")
    public String hello;//使用这个注解我们获取从server端拿到的配置文件中的信息

    @RequestMapping(value = "/getFromServerGit")
    public String getServerConfigInfoFromGit() {
        return this.hello;
    }
//    启动项目后访问：http://localhost:9019/getFromServerGit，返回：hello im dev 说明已经正确的从server端获取到了参数。
//
//    到此一个完整的服务端提供配置服务，客户端获取配置参数的例子就完成了。
//
//    我们在进行一些小实验，手动修改neo-config-dev.properties中配置信息为：neo.hello=hello im dev update1提交到github,
//    再次在浏览器访问http://localhost:9019/getFromServerGit，返回：neo.hello: hello im dev update，
//    说明获取的信息还是旧的参数，这是为什么呢？因为springboot项目只有在启动的时候才会获取配置文件的值，
//    // 修改github信息后，client端并没有在次去获取，所以导致这个问题。如何去解决这个问题呢？留到下一章我们在介绍。
}
