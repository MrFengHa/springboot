package com.home.springbootmybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 文件描述
 * 页面跳转Controller
 *
 * @Author 冯根源
 * @create 2020/5/18 17:50
 */
@Controller
public class PageController {
    /**
     * 页面跳转方法
     */
    @RequestMapping("{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }
}
