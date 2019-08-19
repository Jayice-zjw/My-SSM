package com.jay.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.jay.bean.Student;
import com.jay.dao.studentDao;
import com.jay.dao.impl.studentDaoImpl;
import com.jay.util.*;


//如果使用Mapper代理，无需创建DaoImpl类，让Dao接口名与Mapper中的id名相同，然后在测试类中通过sqlSession来构造Dao的实类
public class test01 {

	private studentDao studentDao;
	private SqlSession sqlSession;
	
	@Before
	public void init() {
		sqlSession=util.getSqlSession();
		studentDao=sqlSession.getMapper(studentDao.class);
	}

	@Test
	public void insertStudent() {
		studentDao = new studentDaoImpl();
		Student student = new Student("陈奕迅", 43, 97.00);

		studentDao.insertStudent(student);
	}

	@Test
	public void deleteStudent() {
		studentDao = new studentDaoImpl();
		studentDao.deleteStudent(5);
	}

	@Test
	public void updateStudent() {
		Student student = new Student("周杰伦", 40, 100);
		student.setId(1);
		studentDao = new studentDaoImpl();
		studentDao.updateStudent(student);

	}

	@Test
	public void selectAllStudent() {
		studentDao = new studentDaoImpl();
		List<Student> res = studentDao.selectAllStudent();
		res.forEach(r -> {
			System.out.println(r);
		});
	}

	@Test
	public void selectStudent1() {
		studentDao = new studentDaoImpl();
		Student student = studentDao.selectStudent(1);
		System.out.println(student);
	}

	@Test
	public void likeSearch() {
		studentDao = new studentDaoImpl();
		List<Student> res = studentDao.likeSearch("杰");
		res.forEach(r -> {
			System.out.println(r);
		});
	}
	
	@After
	public void close() {
		if(sqlSession!=null) {
			sqlSession.close();
		}
	}
}
