package com.home.springbootjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 文件描述
 * 页面跳转Controller
 *
 * @Author 冯根源
 * @create 2020/5/15 11:34
 */
@Controller
public class PageController {
    /**
     * 页面跳转
     *
     * @param page
     * @return
     */
    @RequestMapping("{page}")
    public String showPage(@PathVariable String page) {

        return page;
    }
}
