package com.jay.test;

import com.jay.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从spring中获取对象
        StudentService studentService = (StudentService) context.getBean("studentService");
        studentService.Study();  //好好学习
    }
}
