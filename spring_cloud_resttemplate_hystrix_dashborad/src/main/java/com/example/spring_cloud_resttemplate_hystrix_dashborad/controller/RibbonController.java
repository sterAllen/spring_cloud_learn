package com.example.spring_cloud_resttemplate_hystrix_dashborad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/***
 * 单体应用使用 dashboar进行监控
 * 访问 hystrix-dashboard的地址如下:
 * http://localhost:9014/hystrix   这个会出现小白熊的界面
 * 在有小白熊的界面输入: http://localhost:9014/hystrix.stream即可查看实时的hystrix监控
 * 我们要注意:spring-cloud2.0以上的版本访问上面的网址时要解决:hystrix.stream 404的问题
 *      在SpringCloud 2.0后要解决hystrix.stream 404的问题，
 *      要在application.properties加上下面的
 *      management.endpoints.web.exposure.include=hystrix.stream
 *      management.endpoints.web.base-path=/
 */
@RestController
public class RibbonController {
    @Autowired
    RibbonService ribbonService;
    //http://192.xxx.xx.xx:9014/rest_tmplate?name=123
    @RequestMapping(value="/rest_tmplate")
    public String rest_template_ribbon_test(@RequestParam String name){
        String result = ribbonService.index_ribbon(name);
        System.out.println("---使用resttemplate ribbon测试返回值:"+result);
        return result;
    }

}
