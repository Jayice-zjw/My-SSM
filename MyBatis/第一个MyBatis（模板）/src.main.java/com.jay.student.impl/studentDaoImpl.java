package com.jay.dao.impl;

import org.apache.ibatis.session.SqlSession;
import com.jay.bean.Student;
import com.jay.dao.studentDao;
import com.jay.util.util;

public class studentDaoImpl implements studentDao {

	@SuppressWarnings("unused")
	private SqlSession sqlSession;

	@Override
	public void insertStudent(Student student) {
		//SqlSession继承了AutoClosable接口，可以通过try自动关闭
		try (SqlSession sqlSession = util.getSqlSession()) {
			// 书写MySql语句
			sqlSession.insert("insertStudent", student);
			// 执行MySql语句
			sqlSession.commit();
		}
	}

}
