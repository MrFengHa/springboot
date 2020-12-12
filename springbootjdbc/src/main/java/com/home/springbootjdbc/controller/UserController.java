package com.home.springbootjdbc.controller;

import com.home.springbootjdbc.pojo.Users;
import com.home.springbootjdbc.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/5/16 16:16
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUsersService usersService;

    @GetMapping("/showInfo")
    public String showInfo() {

        return "ok";
    }

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    @RequestMapping("addUser")
    public String addUser(Users user) {
        try {
            this.usersService.addUser(user);
        } catch (Exception e) {
            e.printStackTrace();
            //return "error";
        }
        return "ok";
    }

    @GetMapping("/findUserAll")
    public ModelAndView findAll() {
        System.err.println("执行");
        ModelAndView modelAndView = new ModelAndView();

        List<Users> list = this.usersService.findAll();
        modelAndView.addObject("list", list);
        modelAndView.setViewName("showUsers");

        return modelAndView;
    }
}
