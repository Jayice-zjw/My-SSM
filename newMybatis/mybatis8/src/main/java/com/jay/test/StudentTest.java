package com.jay.test;

import com.jay.bean.Student;
import com.jay.dao.StudentDao;
import com.jay.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;


public class StudentTest {
    public static void main(String[] args){
        SqlSession sqlSession= MybatisUtil.getSqlSession();
        StudentDao studentDao =sqlSession.getMapper(StudentDao.class);

        Student student=new Student("陈奕迅",45,99.00);
        studentDao.insertStudent(student);
        sqlSession.commit();

        Student student1 =new Student(2,"林俊杰",40,99.00);
        studentDao.updateStudent(student1);
        sqlSession.commit();

    }
}