package com.jay.dao.impl;

import com.jay.bean.Student;
import com.jay.dao.StudentDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class StudentDaoImpl implements StudentDao {
    private SqlSession sqlSession;

    public void insertStudent(Student student){
        try {
            InputStream input = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(input);
            sqlSession=sessionFactory.openSession();
            sqlSession.insert("insertStudent",student);
            sqlSession.commit();
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            if (sqlSession != null){
                sqlSession.close();
            }
        }
    }
}
