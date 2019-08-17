package com.monkey1024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class paramsController {
	@RequestMapping("params01")
	//参数名字可以直接写与前端表格中数据名相同的名字
	//若不写相同的名字，可以使用RequestParam注解
	//defaultValue:当前端输入值为空时，默认使用指定的值
	public ModelAndView test1(Student student)throws Exception{
		ModelAndView mv=new ModelAndView();
		mv.addObject("username",student.getName());
		mv.addObject("age",student.getAge());
		mv.addObject("schoolName",student.getSchool().getSchoolname());
		mv.addObject("schoolAdress",student.getSchool().getSchooladress());
		mv.setViewName("result");
		return mv;
	}
}
