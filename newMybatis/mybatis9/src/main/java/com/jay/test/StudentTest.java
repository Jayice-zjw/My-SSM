package com.jay.test;

import com.jay.bean.Student;
import com.jay.dao.StudentDao;
import com.jay.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


public class StudentTest {
    public static void main(String[] args){
        SqlSession sqlSession= MybatisUtil.getSqlSession();
        StudentDao studentDao =sqlSession.getMapper(StudentDao.class);

        Student student=new Student("",20,0);
        List<Student> ans=studentDao.selectChoose(student);
        System.out.println(ans);
    }
}