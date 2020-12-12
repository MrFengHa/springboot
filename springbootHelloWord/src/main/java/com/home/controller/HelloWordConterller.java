package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文件描述
 * 请求处理Controller
 * @Author 冯根源
 * @create 2020/5/14 15:59
 */
@RestController/*@Controller+@ResponseBody 直接返回json字符串*/
@RequestMapping("hello")
public class HelloWordConterller {

    @RequestMapping("helloWorld")
    public String showHelloWorld(){
        return "HelloWorld";
    }
}
