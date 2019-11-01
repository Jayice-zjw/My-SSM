package com.jay.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 */
public class FirstController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("hello", "hello first spring mvc");
        mv.setViewName("first");
        return mv;
    }
}
