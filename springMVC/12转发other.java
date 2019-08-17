package com.monkey1024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class other {
	@RequestMapping("/other")
	//参数名和上一个Controller的key保持一致，就能直接接收
	public ModelAndView forward(String type)throws Exception {
		ModelAndView mv=new ModelAndView();
		//默认使用转发进行跳转
		mv.setViewName("forward");
		return mv;	
	}
}
