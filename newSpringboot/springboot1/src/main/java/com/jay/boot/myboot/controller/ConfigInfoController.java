package com.jay.boot.myboot.controller;

import com.jay.boot.myboot.config.ConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigInfoController {
    /*读取自定义配置方式1*/
    @Value("${school.name}")
    private String name;

    @Value("${school.address}")
    private String address;

    @Value("${school.age}")
    private int age;

    @GetMapping("/init1")
    public String test1(){
        return name+" "+address+" "+age;
    }

    /*读取自定义配置方法2*/
    @Autowired
    private ConfigInfo configInfo;
    @GetMapping("/init2")
    public String test2(){
        return configInfo.getName();
    }
}
