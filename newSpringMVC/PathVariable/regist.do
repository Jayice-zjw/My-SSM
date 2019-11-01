package com.jay.controller;


import com.jay.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class regist1 {

//直接在浏览器输入localhost:8080/xxx/10/regist.do   就能把参数传到controller中了
    @RequestMapping("/{username}/{age}/regist.do")
    public ModelAndView regist(@PathVariable("username")String name,@PathVariable int age){
        ModelAndView mv=new ModelAndView();
        mv.addObject("username",name);
        mv.addObject("age",age);
        mv.setViewName("result");
        return mv;
    }
}
