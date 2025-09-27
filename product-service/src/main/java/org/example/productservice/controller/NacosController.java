package org.example.productservice.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//这个注解是配置的热更新~~
@RefreshScope
@RestController
public class NacosController {


    @Value("${nacos.config}")
    private String nacosConfig;



    @RequestMapping("/getConfig")
    public String getConfig(){
        return "从nacos获取配置项nacos.config"+nacosConfig;
    }
}
