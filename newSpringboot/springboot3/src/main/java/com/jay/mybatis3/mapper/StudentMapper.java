package com.jay.mybatis3.mapper;

import com.jay.mybatis3.bean.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {

    List<Student> selectAllStudent();
    Student selectStudentByName(String name);
}
