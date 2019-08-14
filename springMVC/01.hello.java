package shit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//连接Controller接口

public class hello implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
    //类似于request的setAtrribute方法
		mv.addObject("hello", "hello first spring mvc");
    //指定要跳转的jsp界面
		mv.setViewName("/WEB-INF/jsp/first.jsp");
		return mv;
	}


}
