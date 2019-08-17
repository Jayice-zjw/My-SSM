package com.monkey1024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class paramsController {
	@RequestMapping("/welcome.do")

	public String test1() throws Exception {
		// 跳转regist.jsp界面
		return "regist";
	}

	@RequestMapping("/baidu.do")  

	public String test2() throws Exception {
		// 跳转regist.jsp界面
		return "baidu";//这个要和springmvc的bean id相同
	}
}
