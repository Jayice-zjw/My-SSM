//@GetMapping用于查
//@PostMapping用于增
//@PutMapping用于改
//@DeleteMapping用于删



@package com.monkey1024.controller;


import com.alibaba.fastjson.JSON;
import com.monkey1024.bean.User;
import com.monkey1024.util.DataUtil;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
@RestController
public class UserRestController {

    /**
     * 查找所有用户
     *
     * @return
     * @throws Exception
     */

    @GetMapping("/users")
    public String findAll() throws Exception {

        HashMap<String, User> allUser = DataUtil.findAll();
        //转为JSON型的字符串
        return JSON.toJSONString(allUser);
    }

    /**
     * 根据id查找
     *
     * @param id
     * @return
     * @throws Exception
     */

    @GetMapping("/users/{id}")
    public String findById(@PathVariable String id) throws Exception {
        User user = DataUtil.findById(id);

        
        return JSON.toJSONString(user);
    }


    /**
     * 新增
     *
     * @param user
     * @return
     */

    @PostMapping("/users")
    //把穿过了的JSON格式转化为User对象
    public String create(@RequestBody User user) {

        try {
            DataUtil.create(user);
            System.out.println(user.getName());
        } catch (Exception e) {
            e.printStackTrace();
            return JSON.toJSONString("fail");
        }

        return JSON.toJSONString("success");
    }


    /**
     * 更新
     *
     * @param id
     * @param user
     * @return
     */

    @PutMapping("/users/{id}")
    public String update(@PathVariable String id, @RequestBody User user) {
        try {
            DataUtil.update(id, user);
        } catch (Exception e) {
            e.printStackTrace();
            return JSON.toJSONString("fail");
        }
        return JSON.toJSONString("success");
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */

    @DeleteMapping("/users/{id}")
    public String delete(@PathVariable String id) {

        try {
            DataUtil.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
            return JSON.toJSONString("fail");
        }
        return JSON.toJSONString("success");
    }
}
