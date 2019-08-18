package com.jay.controller;

import com.jay.bean.User;
import com.jay.util.DataUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

@Controller
public class userController {

    /**
     * 查找所有用户
     * @return
     * @throws Exception
     */
    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception{

        HashMap<String, User> allUser = DataUtil.findAll();

        ModelAndView mv = new ModelAndView();
        mv.addObject("allUser",allUser);
        mv.setViewName("user_list");

        return mv;
    }

    /**
     * 根据id查找
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping("/findById.do")
    public ModelAndView findById(String id) throws Exception{

        ModelAndView mv = new ModelAndView();
        User user = DataUtil.findById(id);
        HashMap<String, User> allUser = new HashMap<>();
        allUser.put(id, user);

        mv.addObject("allUser", allUser);
        mv.addObject("id", id);
        mv.setViewName("user_list");
        return mv;
    }

    /**
     * 新增
     * @param user
     * @return
     */
    @RequestMapping("/create.do")
    public String create(User user) throws Exception{

        DataUtil.create(user);

        return "redirect:/crud/findAll.do";
    }

    /**
     * 更新
     * @param id
     * @param user
     * @return
     */
    @RequestMapping("/update.do")
    public String update(String id, User user) throws Exception{
            DataUtil.update(id, user);

        return "redirect:/crud/findAll.do";
    }

    @RequestMapping("/goUpdate.do")
    public ModelAndView goUpdate(String id)throws Exception{

        User user = DataUtil.findById(id);
        ModelAndView mv = new ModelAndView();
        mv.addObject("user", user);
        mv.addObject("id", id);
        mv.setViewName("user_update");

        return mv;
    }
 
    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("/delete.do")
    public String delete(String id) throws Exception{

            DataUtil.delete(id);

        return "redirect:/crud/findAll.do";
    }
}
