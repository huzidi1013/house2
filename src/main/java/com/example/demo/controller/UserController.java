package com.example.demo.controller;

import com.example.demo.common.model.User;
import com.example.demo.service.UserService;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("user")
    public List<User> getUsers() {
        return userService.getUsers();
    }

   /** 
   * @Description:  注册接口
    *注册验证--发送邮件--验证失败重定向到注册页面
    *获取注册页面使用同样的接口
   * @Param:  
   * @return:  
   * @Author: huzidi 
   * @Date: 2018/9/18 
   */ 
    @RequestMapping("account/register")
    public String register(User user, ModelMap modelMap) {

        //如果账号信息为空的话，跳转到注册页面
        if(user ==null ||user.getName() ==null){
            return "/user/acounts/register";
        }
        //如果不为空，则对输入的信息进行校验



        Map<String, String> map = Maps.newHashMap();
        Map<String, String> newmap = Maps.newHashMap();


        map.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
            if (v != null) {
                newmap.put(k, "");
            }
        });
        return "/user/acounts/register";

    }
}