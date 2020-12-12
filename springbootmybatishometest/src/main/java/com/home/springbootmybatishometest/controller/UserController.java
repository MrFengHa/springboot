package com.home.springbootmybatishometest.controller;

import com.home.springbootmybatishometest.pojo.Users;
import com.home.springbootmybatishometest.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 文件描述
 *
 * @author 冯根源
 * @date 2020/5/19 22:57
 */
@Controller()
@RequestMapping("user")
public class UserController {
    @Autowired
    IUserService userService;
    @PostMapping("addUser")
    public String addUser(Users users){
        System.out.println(users.getUsername());
        userService.addUser(users);
        return "ok";
    }
}
