package com.example.demo.controller;

import com.example.demo.common.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HelloController {
    @Autowired
    private UserService userService;
    @RequestMapping("hello")
    public String hello(ModelMap modelMap){
        List<User> users = userService.getUsers();
        User user = users.get(0);
        modelMap.put("users",user.getName());
        return "hello";
    }
    @RequestMapping("index")
    public String index(ModelMap modelMap){

        return "homepage/index";

    }

}
