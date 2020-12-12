package com.home.springbootjdbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 文件描述
 * 页面跳转Controller
 * @Author 冯根源
 * @create 2020/5/18 10:15
 */
@Controller
public class PageController {
    /**
     * 页面跳珠的方法
     */
    @RequestMapping("{page}")
    public String toAddUser(@PathVariable String page){
        return page;
    }
}
