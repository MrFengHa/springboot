package com.home.springbootmybatishometest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 文件描述
 *
 * @author 冯根源
 * @date 2020/5/19 22:58
 */
@Controller
public class PageController {
    @RequestMapping("{page}")
    public String toPage(@PathVariable("page") String page){
        return page;
    }
}
