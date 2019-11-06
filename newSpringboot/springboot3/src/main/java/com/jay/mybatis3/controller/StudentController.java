package com.jay.mybatis3.controller;


import com.jay.mybatis3.bean.Student;
import com.jay.mybatis3.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/student")
    @ResponseBody
    public List<Student> selectAllStudent(){
        return studentService.selectAllStudent();
    }

    @GetMapping("/checkOneStudent")
    @ResponseBody
    public Student selectStudentByName(){
        return studentService.selectStudentByName("jaychou");
    }
}
