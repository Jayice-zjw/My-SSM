package com.jay.aaa;

import javax.servlet.http.HttpServletRequest;


import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import com.jay.aaa.*;

public class excResolver implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		//ex记录了异常
		ModelAndView mv = new ModelAndView();
		mv.addObject("ex", ex);

		// 设置默认异常处理页面
		mv.setViewName("error/error");

		// 判断ex是否是MyException
		if (ex instanceof myException) {
			// 可以在这里面编写捕获到该异常之后的操作

			// 设置跳转页面
			mv.setViewName("error/myerror");
		}

		return mv;
	}

}
