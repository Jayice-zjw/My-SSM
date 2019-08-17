package com.monkey1024.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class HelloSpringMVC {
	//只接收post请求，且只接收name和age作为传进来的数据
	@RequestMapping(value="/post.do",method=RequestMethod.POST,params="name,age")
	public ModelAndView test1(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mv = new ModelAndView();
		mv.addObject("method", "只支持post请求");
		mv.setViewName("method");
		return mv;
	}

	@RequestMapping( value="/get.do", method=RequestMethod.GET )  //字符串数组
	public ModelAndView test2(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mv = new ModelAndView();
		mv.addObject("method", "只支持get请求");
		mv.setViewName("method");
		return mv;
	}
}
