package com.monkey1024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Forward {
	@RequestMapping("/forward")
	public ModelAndView forward()throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.addObject("type","利用model进行转发");
		//mv.setViewName("regist");
		//如果要转发到其他Controller上，一定要加上forward:。否则会被当做jsp的名字
		mv.setViewName("forward:other.do");
		return mv;	
	}
}
