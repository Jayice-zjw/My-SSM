package com.jay.controller;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        //可以使用instanceof来根据异常类型进行不同的跳转
        ModelAndView mv = new ModelAndView();
        mv.setViewName("MyError");
        return mv;
    }
}
