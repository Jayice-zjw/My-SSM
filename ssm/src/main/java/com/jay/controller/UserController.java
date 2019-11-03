package com.jay.controller;


import com.alibaba.fastjson.JSON;
import com.jay.bean.User;
import com.jay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/users")
    public String selectUsers(){

        List<User> users = userService.selectUsers();


        return JSON.toJSONString(users);
    }

    @GetMapping("/users/{id}")
    public String selectUserById(@PathVariable int id) {

        User user = userService.selectUserById(id);

        return JSON.toJSONString(user);
    }

    @PostMapping("/users")
    public String addUser(@RequestBody User user) {


        try {
            userService.addUser(user);

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

    @PutMapping("/test")
    public ModelAndView test(String name){
        ModelAndView mv=new ModelAndView();
        mv.addObject("name",name);
        mv.setViewName("/jsp/result.jsp");
        return mv;
    }
}
