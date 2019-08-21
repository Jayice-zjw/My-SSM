package com.jay.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.jay.service1.StudentService;

public class test {

	/**
	 * 使用spring之后的写法：直接通过spring获取对象
	 */
	@Test
	public void springType() {
		// 读取spring配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 从spring中获取对象
		StudentService StudentService1 = (StudentService) context.getBean("studentService");
		StudentService1.play();

		// context是ApplicationContext类型的，需要强转回去
		((ClassPathXmlApplicationContext) context).close();
		/*
		 * 构造器 bean的before方法 bean初始化 bean的After方法 好好学习 bean销毁
		 */
	}
	
	@Test
	public void springType1() {
		String[] files= {"applicationContext.xml","spring-bean.xml","spring-aop.xml"};
		ApplicationContext context=new ClassPathXmlApplicationContext(files);
	}
}
