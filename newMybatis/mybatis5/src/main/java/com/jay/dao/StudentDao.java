package com.jay.dao;

import com.jay.bean.Student;

public interface StudentDao {

    void insertStudent(Student student);
    void deleteStudent(int id);
    void updateStudent(Student student);
}
