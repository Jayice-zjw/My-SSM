package com.jay.dao.impl;

import com.jay.bean.Student;
import com.jay.dao.StudentDao;
import org.apache.ibatis.session.SqlSession;
import com.jay.util.MybatisUtil;

public class StudentDaoImpl implements StudentDao {
    private SqlSession sqlSession;

    public void insertStudent(Student student){
        //SqlSession继承了AutoCloseable接口，所以可以自动关闭
        try(SqlSession sqlSession = MybatisUtil.getSqlSession()) {
            //新增数据操作
            sqlSession.insert("insertStudent", student);
            //提交SqlSession
            sqlSession.commit();

        }
    }

    public void deleteStudent(int id){
        try(SqlSession sqlSession = MybatisUtil.getSqlSession()) {
            sqlSession.delete("deleteStudent",id);
            sqlSession.commit();
        }
    }

    public void updateStudent(Student student){
        try(SqlSession sqlSession = MybatisUtil.getSqlSession()) {
            sqlSession.update("updateStudent",student);
            sqlSession.commit();
        }
    }
}
