package com.jay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 */
@Controller  //要加上Controller
//不用继承Controller接口了
public class FirstController{
    @RequestMapping({"/test/test1.do","/test/test2.do"})
    public ModelAndView Test1(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("hello", "hello first spring mvc");
        mv.setViewName("first");
        return mv;
    }

    @RequestMapping("/hello.do")
    public ModelAndView handleRequest1(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("hello", "hello mapping");
        mv.setViewName("first");
        return mv;
    }
}
