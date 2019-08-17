package com.monkey1024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class paramsController {
	@RequestMapping("/{username}/{age}/params01.do")
	
	public ModelAndView test1(@PathVariable("username") String name,@PathVariable("age") int age)throws Exception{
		ModelAndView mv=new ModelAndView();
		mv.addObject("username",name);
		mv.addObject("age",age);
		mv.setViewName("result");
		return mv;
	}
}
