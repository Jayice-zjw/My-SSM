package com.monkey1024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class paramsController {
	//ModelAndView其实就是Model发回记录数据的作用，View发挥跳转页面的作用
	//那么完全可以单独使用Model接口，然后用String类型来进行跳转
	@RequestMapping("/welcome.do")
	public String test1(Model model) throws Exception {
		model.addAttribute("username","jack");
		// 跳转regist.jsp
		return "regist";
	}

	
}
