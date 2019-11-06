package com.jay.mybatis3.service;

import com.jay.mybatis3.bean.Student;

import java.util.List;

public interface StudentService {
    List<Student> selectAllStudent();

    Student selectStudentByName(String name);
}
