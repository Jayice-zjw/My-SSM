package com.jay.controller;

import com.jay.bean.Student;
import com.jay.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/test")
    public void test(Student student){
        studentService.insertStudent(student);
    }
}
