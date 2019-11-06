package com.jay.boot.myboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JspController {

    @GetMapping("/showJsp")
    public String showJso(Model model){
        model.addAttribute("msg","hello");
        return "test";
    }
}
