package com.jay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 */
@Controller
public class FirstController{

    //以test开头
    @RequestMapping("/test*.do")
    public ModelAndView handleRequest1(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("hello", "hello mapping1");
        mv.setViewName("first");
        return mv;
    }

    //以test结尾
    @RequestMapping("/*test.do")
    public ModelAndView handleRequest2(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("hello", "hello mapping2");
        mv.setViewName("first");
        return mv;
    }
    //以test开头，test结尾，第二级目录任意
    @RequestMapping("/test/*/test.do")
    public ModelAndView handleRequest3(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("hello", "hello mapping3");
        mv.setViewName("first");
        return mv;
    }
    //以test开头，test结尾，中间可以有任意级目录
    @RequestMapping("/test/**/test.do")
    public ModelAndView handleRequest4(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("hello", "hello mapping4");
        mv.setViewName("first");
        return mv;
    }
}
