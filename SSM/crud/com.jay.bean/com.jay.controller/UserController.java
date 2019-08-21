package com.jay.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.jay.bean.User;
import com.jay.service.UserService;

@RestController
public class UserController {
	private UserService userService;

	// 查询全部用户
	@GetMapping("/users")
	public String selectUsers() {
		List<User> res = userService.selectUsers();
		return JSON.toJSONString(res);
	}

	@GetMapping("/users/{id}")
	public String selectById(@PathVariable int id) {
		User user = userService.selectUserById(id);
		return JSON.toJSONString(user);
	}

	@PostMapping("/users")
	public String addUser(@RequestBody User user) {
		try {
			userService.addUser(user);
			// 如果成功就返回success
			return JSON.toJSONString("success");
		} catch (Exception e) {
			e.printStackTrace();
			return JSON.toJSONString("fail");
		}
	}

	@PutMapping("/users/{id}")
	public String updateUser(@PathVariable int id, @RequestBody User user) {

		try {
			user.setId(id);
			userService.updateUser(user);

			return JSON.toJSONString("success");
		} catch (Exception e) {
			e.printStackTrace();
			return JSON.toJSONString("fail");
		}
	}

	@DeleteMapping("/users/{id}")
	public String deleteUser(@PathVariable int id) {

		try {
			userService.deleteUser(id);

			return JSON.toJSONString("success");
		} catch (Exception e) {
			e.printStackTrace();
			return JSON.toJSONString("fail");
		}
	}
}
