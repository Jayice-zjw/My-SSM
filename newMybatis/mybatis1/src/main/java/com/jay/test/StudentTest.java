package com.jay.test;

import com.jay.bean.Student;
import com.jay.dao.impl.StudentDaoImpl;
import com.jay.dao.StudentDao;

public class StudentTest {
    public static void main(String[] args){
        StudentDao studentDao=new StudentDaoImpl();
        Student student=new Student("周杰伦",40,100);
        studentDao.insertStudent(student);
    }
}
