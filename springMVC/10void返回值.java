package com.monkey1024.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class paramsController {
	// 返回值为void的话。则需要使用servlet中的request和response来进行记录数据和跳转界面
	@RequestMapping("/welcome.do")
	public void test1(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setAttribute("username", "jack");
		request.getRequestDispatcher("/jsp/result.jsp").forward(request, response);
	}

}
