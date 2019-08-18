package com.monkey1024.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		String user = (String) request.getSession().getAttribute("user");
		// 这里仅判断用户名为monkey1024的用户是否已登录
		if (!"monkey1024".equals(user)) {
			request.getRequestDispatcher("/jsp/fail.jsp").forward(request, response);

			// 不进行后续的处理操作
			return false;
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("拦截器中的postHandle方法");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("拦截器中的afterCompletion方法");
	}
}
