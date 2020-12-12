package com.home.springbootmybatis.controller;

import com.home.springbootmybatis.mapper.UsersMapper;
import com.home.springbootmybatis.pojo.Users;
import com.home.springbootmybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 文件描述
 * 用户管理Controller
 *
 * @Author 冯根源
 * @create 2020/5/18 17:51
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;

    /**
     * 添加用户
     */
    @PostMapping("addUser")
    public String addUsers(Users user) {
        userService.addUser(user);
        return "ok";
    }

    /**
     * 查询所有用户参数
     *
     * @return
     */
    @RequestMapping("findAllUser")
    public ModelAndView findUserAll() {
        ModelAndView modelAndView = new ModelAndView();
        List<Users> list = userService.findUserAll();
        modelAndView.addObject("list", list);
        modelAndView.setViewName("showUsers");
        return modelAndView;

    }

    /**
     * 更新用户信息
     *
     * @return
     */
    @RequestMapping("preUpdateUser")
    public ModelAndView preUpdateUser(@RequestParam(value = "id") Integer userid) {
        ModelAndView modelAndView = new ModelAndView();
        Users users = userService.findById(userid);
        modelAndView.addObject("user", users);
        modelAndView.setViewName("updateUser");
        return modelAndView;
    }

    /**
     * 更新用户
     *
     * @return
     */
    @RequestMapping("updateUser")
    public ModelAndView updateUser(Users users) {
        ModelAndView modelAndView = new ModelAndView();
        userService.updateUser(users);
        modelAndView.setViewName("ok");
        return modelAndView;
    }

    /**
     * 删除用户
     *
     * @return
     */
    @RequestMapping("deleteUser")
    public String deleteUser(@RequestParam(name = "id") Integer userid) {
        userService.deleteUser(userid);
        return "ok";
    }
}
