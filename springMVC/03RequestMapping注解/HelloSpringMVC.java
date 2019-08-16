package com.monkey1024.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class HelloSpringMVC {
	@RequestMapping("/test1*.do")
	public ModelAndView test1(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mv = new ModelAndView();
		mv.addObject("hello", "test1");
		mv.setViewName("test1");
		return mv;
	}

	@RequestMapping({ "/test2.do", "/hello.do" })  //字符串数组
	public ModelAndView test2(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mv = new ModelAndView();
		mv.addObject("hello", "test2");
		mv.setViewName("test2");
		return mv;
	}
}
