package com.jay.service.impl;

import com.jay.bean.Student;
import com.jay.dao.StudentDao;
import com.jay.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public void insertStudent(Student student) {
        studentDao.insertStudent(student);
    }
}
