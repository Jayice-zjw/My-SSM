package com.jay.test;

import java.util.List;

import org.junit.Test;

import com.jay.bean.Student;
import com.jay.dao.studentDao;
import com.jay.dao.impl.studentDaoImpl;

public class test01 {

	private studentDao studentDao;

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
		Student student=new Student("周杰伦",40,100);
		student.setId(1);
		studentDao = new studentDaoImpl();
		studentDao.updateStudent(student);
		
	}
	
	@Test
	public void selectAllStudent() {
		studentDao = new studentDaoImpl();
		List<Student> res=studentDao.selectAllStudent();
		res.forEach(r->{
			System.out.println(r);
		});
	}
	
	@Test
	public void selectStudent1() {
		studentDao=new studentDaoImpl();
		Student student=studentDao.selectStudent(1);
		System.out.println(student);
	}
}
