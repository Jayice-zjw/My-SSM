package com.jay.dao;

import com.jay.bean.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao {
    void insertStudent(Student student);
}
