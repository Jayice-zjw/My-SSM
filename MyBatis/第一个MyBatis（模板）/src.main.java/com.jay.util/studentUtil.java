package com.jay.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class util {
	private static volatile SqlSessionFactory sqlSessionFactory;
	//使用单例模式
	public static SqlSession getSqlSession() {
		try {
			if (sqlSessionFactory == null) {
				// 读取主配置文件
				InputStream input = Resources.getResourceAsStream("mybatis.xml");
				synchronized (util.class) {
					if (sqlSessionFactory == null) {
						sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
					}
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return sqlSessionFactory.openSession();
	}
}
