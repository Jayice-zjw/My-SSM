package com.jay.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.jay.bean.Student;
import com.jay.dao.*;
import com.jay.util.util;

public class test01 {

	private studentDao studentDao=null;
	private SqlSession sqlSession=null;

	@Before
	public void init() {
		sqlSession = util.getSqlSession();
		studentDao = sqlSession.getMapper(studentDao.class);
	}

	@Test
	public void selectStudents1() {
		Student student = new Student("杰", 30);
		List<Student> res = studentDao.selectStudents(student);
		res.forEach(r -> {
			System.out.println(r);
		});
	}
	
	@Test
	public void selectStudents2() {
		Student student = new Student("", 30);
		List<Student> res = studentDao.selectStudents(student);
		res.forEach(r -> {
			System.out.println(r);
		});
	}

	@After
	public void close() {
		if (sqlSession != null) {
			sqlSession.close();
		}
	}
}
