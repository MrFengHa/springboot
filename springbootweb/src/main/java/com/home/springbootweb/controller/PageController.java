package com.home.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 文件描述
 * 控制类
 * @Author 冯根源
 * @create 2020/5/14 17:14
 */
@Controller
public class PageController {
    @RequestMapping("page")
    public String showPage(){
        return "index.html";
    }
}
