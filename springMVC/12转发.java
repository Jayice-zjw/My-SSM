package com.monkey1024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*转发和重定向的区别。转发后前端显示的地址不会发生改变，而重定向后地址会改变。因为转发用的是同一个request*/
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
