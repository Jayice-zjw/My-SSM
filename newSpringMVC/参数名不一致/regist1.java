package com.jay.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class regist1 {
    @RequestMapping("regist1.do")
    //默认为jayice，18
    public ModelAndView regist(@RequestParam(name = "username",defaultValue = "jayice") String t_username, @RequestParam(name = "age",defaultValue = "18") int t_age){
        ModelAndView mv=new ModelAndView();
        mv.addObject("username",t_username);
        mv.addObject("age",t_age);
        mv.setViewName("result");
        return mv;
    }
}
