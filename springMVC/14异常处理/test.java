package com.jay.exc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class test {
	@RequestMapping("/myException.do")
	public ModelAndView myException(String name) throws Exception {
		ModelAndView mv = new ModelAndView();
		if (name.equals("jack")) {
			throw new myException("我的自定义异常");
		}
		if(!name.equals("jack")) {
			throw new Exception("异常");
		}
		return mv;
	}
}
