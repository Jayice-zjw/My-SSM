package com.jay.controller;


import com.alibaba.fastjson.JSON;
import com.jay.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class regist1 {
    @RequestMapping("/{username}/{age}/regist.do")
    public ModelAndView regist(@PathVariable("username")String name,@PathVariable int age){
        ModelAndView mv=new ModelAndView();
        mv.addObject("username",name);
        mv.addObject("age",age);
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping("/baidu.do")
    public String baidu()throws Exception{
        return "form";
    }

    @RequestMapping("/sohu.do")
    public String sohu(Model model){
        model.addAttribute("username","jayice");
        model.addAttribute("age",19);
        return "result";
    }

    @RequestMapping("/ajaxRequest.do")
    public void ajaxRequest(HttpServletRequest request, HttpServletResponse response, Student student) throws Exception{
        PrintWriter out=response.getWriter();
        String jsonString = JSON.toJSONString(student);
        out.write(jsonString);
    }

    @RequestMapping("/object.do")
    @ResponseBody
    public Object test(String name){
        Map<String,String> map=new HashMap();
        map.put("1","1");
        map.put("2","2");
        return map;
    }

    @RequestMapping("error.do")
    public ModelAndView testError(){
        ModelAndView mv=new ModelAndView();
        int i=1/0;
        return mv;
    }

    @RequestMapping("test.do")
    //不能将@Validated 注解在String类型和基本类型的形参前。
    //BindingResult参数可以获取到所有验证异常的信息
    public ModelAndView test1 (@Validated Student student, BindingResult br){
        ModelAndView mv=new ModelAndView();
        List<ObjectError> allErrors = br.getAllErrors();
        System.out.println(allErrors.size());
        if (allErrors != null && allErrors.size() > 0) {
            FieldError nameError = br.getFieldError("name");
            FieldError ageError = br.getFieldError("age");

            if (nameError != null) {
                mv.addObject("nameError", nameError.getDefaultMessage());
            }
            if (ageError != null) {
                mv.addObject("ageError", ageError.getDefaultMessage());
            }
            mv.setViewName("/form");
            return mv;
        }
        mv.addObject("name", student.getName());
        mv.addObject("age",student.getAge());
        mv.setViewName("/result");
        return mv;
    }

    @RequestMapping("login.do")
    public ModelAndView login(HttpSession httpSession){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("login");
        httpSession.setAttribute("user","jayice");
        return mv;
    }

    @RequestMapping("aaa.do")
    public ModelAndView aaa(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("login");
        return mv;
    }
}
