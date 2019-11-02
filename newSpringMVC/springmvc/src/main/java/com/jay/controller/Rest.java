package com.jay.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Rest {

    @GetMapping("/user")
    public ModelAndView test(String name,int age){
        ModelAndView mv=new ModelAndView();
        mv.addObject("name",name);
        mv.addObject("age",age);
        mv.setViewName("result");
        return mv;
    }
}
