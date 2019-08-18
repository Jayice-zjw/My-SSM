package com.jay.util;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



import com.jay.bean.User;

public class DataUtil {
	private static HashMap<String, User> map = new HashMap<>();

	static {
		User user1 = new User("jack", "15188888888", "北京", LocalDate.of(2010, 10, 10));
		User user2 = new User("andy", "13766666666", "上海", LocalDate.of(2014, 11, 11));
		User user3 = new User("paul", "13099999999", "广州", LocalDate.of(2012, 12, 12));

		map.put("1", user1);
		map.put("2", user2);
		map.put("3", user3);
	}

	/**
	 * 查找全部数据
	 * 
	 * @return
	 */
	public static HashMap<String, User> findAll() {
		return map;
	}

	/**
	 * 根据id查找用户
	 * 
	 * @param id
	 * @return
	 */
	public static User findById(String id) {
		return map.get(id);
	}

	/**
	 * 创建用户
	 * 
	 * @param user
	 * @throws Exception
	 */
	public static void create(User user) throws Exception {
		// 遍历map找到key的最大值
		Set<Map.Entry<String, User>> entries = map.entrySet();
		Iterator<Map.Entry<String, User>> iterator = entries.iterator();
		int max = 3;
		while (iterator.hasNext()) {
			Map.Entry<String, User> next = iterator.next();
			int i = Integer.parseInt(next.getKey());
			if (i > max) {
				max = i;
			}
		}

		// 将最大值做自增运算，然后作为key放入map中
		map.put(++max + "", user);
	}

	/**
	 * 更新用户
	 * 
	 * @param id
	 * @param user
	 */
	public static void update(String id, User user) throws Exception {
		map.put(id, user);
	}

	/**
	 * 根据id删除用户
	 * 
	 * @param id
	 * @throws Exception
	 */
	public static void delete(String id) throws Exception {
		map.remove(id);
	}
}
