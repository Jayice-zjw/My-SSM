package shit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class hello implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		//相当于request的setAtrribute方法
		mv.addObject("hello", "hello first spring mvc");
		mv.setViewName("first");  //要跳转的jsp
		return mv;
	}


}
