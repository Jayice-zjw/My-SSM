package com.monkey1024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class paramsController {
	@RequestMapping("params01")
	//参数名字可以直接写与前端表格中数据名相同的名字
	public ModelAndView test1(String username,int age)throws Exception{
		ModelAndView mv=new ModelAndView();
		mv.addObject("username",username);
		mv.addObject("age",age);
		mv.setViewName("result");
		return mv;
	}
}
