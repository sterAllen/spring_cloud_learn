package com.example.spring_cloud_resttemplate_hystrix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {
    @Autowired
    RibbonService ribbonService;
    //http://192.xxx.xx.xx:9012/rest_tmplate?name=123
    @RequestMapping(value="/rest_tmplate")
    public String rest_template_ribbon_test(@RequestParam String name){
        String result = ribbonService.index_ribbon(name);
        System.out.println("---使用resttemplate ribbon测试返回值:"+result);
        return result;
    }

}
