package com.jay.dao;

import com.jay.bean.Student;

import java.util.List;

public interface StudentDao {

    void insertStudent(Student student);
    void deleteStudent(int id);
    void updateStudent(Student student);
    List<Student> selectStudentList();
    Student selectOneStudent(int id);
}
