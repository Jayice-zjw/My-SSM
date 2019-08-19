package com.jay.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import com.jay.bean.Student;
import com.jay.dao.studentDao;
import com.jay.util.util;

public class studentDaoImpl implements studentDao {

	@SuppressWarnings("unused")
	private SqlSession sqlSession=null;

	@Override
	public void insertStudent(Student student) {
		// SqlSession继承了AutoClosable接口，可以通过try自动关闭
		try (SqlSession sqlSession = util.getSqlSession()) {
			// 书写MySql语句
			sqlSession.insert("insertStudent", student);
			// 执行MySql语句
			sqlSession.commit();
		}
	}

	@Override
	public void deleteStudent(int id) {
		try (SqlSession sqlSession = util.getSqlSession()) {
			// 书写MySql语句
			sqlSession.delete("deleteStudent", id);
			sqlSession.commit();
		}
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		try (SqlSession sqlSession = util.getSqlSession()) {

			// 修改数据操作
			sqlSession.update("updateStudent", student);
			// 提交SqlSession
			sqlSession.commit();

		}

	}
  
  
  //查找
	@Override
	public List<Student> selectAllStudent() {
		List<Student> allStudents=null;
		try(SqlSession sqlSession=util.getSqlSession()){
			allStudents=sqlSession.selectList("selectAllStudent");
		}
		return allStudents;
	}

}
