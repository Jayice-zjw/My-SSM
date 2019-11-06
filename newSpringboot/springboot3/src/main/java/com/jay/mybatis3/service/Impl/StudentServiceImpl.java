package com.jay.mybatis3.service.Impl;

import com.jay.mybatis3.bean.Student;
import com.jay.mybatis3.mapper.StudentMapper;
import com.jay.mybatis3.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> selectAllStudent() {
        return studentMapper.selectAllStudent();
    }

    @Override
    public Student selectStudentByName(String name) {
        return studentMapper.selectStudentByName(name);
    }
}
