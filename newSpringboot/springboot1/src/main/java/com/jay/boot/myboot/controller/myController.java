package com.jay.boot.myboot.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {

    @GetMapping("/first")
    @ResponseBody
    public String first(){
        return  "first";
    }
}
