package com.home.springfreemarker.controller;

import com.home.springfreemarker.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件描述
 * UserController
 * @Author 冯根源
 * @create 2020/5/15 12:18
 */
@Controller
public class UserController {
    /**
     * 处理请求返回数据
     * @param model
     * @return
     */
    @RequestMapping("showUsers")
    public String showUsers(Model model){
        List<Users> list = new ArrayList<>();
        list.add(new Users("admin","F","32"));
        list.add(new Users("Lisi","M","23"));
        list.add(new Users("XIAOlI","F","23"));
        model.addAttribute("list",list);
        return "userList";
    }
}
