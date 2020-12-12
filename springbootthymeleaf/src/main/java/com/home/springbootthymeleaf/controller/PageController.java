package com.home.springbootthymeleaf.controller;

import com.home.springbootthymeleaf.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * 文件描述
 * 跳转页面
 *
 * @Author 冯根源
 * @create 2020/5/15 14:55
 */
@Controller
public class PageController {
    @RequestMapping("pages")
    public String toPage(Model model, HttpServletRequest request) {
        model.addAttribute("msg", "啦啦啦啦啦啦");
        model.addAttribute("date", new Date());
        model.addAttribute("sex", "女");
        model.addAttribute("id", "1");
        List<Users> list = new ArrayList<>();
        list.add(new Users("1", "zhangsan", 23));
        list.add(new Users("2", "kevin", 22));
        list.add(new Users("3", "oldxiang", 25));
        list.add(new Users("4", "xiaoli", 26));
        model.addAttribute("list",list);

        Map<String,Users> map = new HashMap<>();
        map.put("user1",new Users("1", "zhangsan", 23));
        map.put("user2",new Users("2", "kevin", 22));
        map.put("user3",new Users("3", "oldxiang", 22));
        model.addAttribute("map",map);

        request.setAttribute("req","HttpServletRequest");
        request.getSession().setAttribute("ses","HttpSession");
        request.getSession().getServletContext().setAttribute("app","application");

        model.addAttribute("id","100");
        model.addAttribute("name","三宝");
        return "index";
    }

    @RequestMapping("show2")
    public String show2(String id,String name){
        System.out.println(id+":"+name);
        return "index2";
    }

    @RequestMapping("show3/{id}/{name}")
    public String show3(@PathVariable String id, @PathVariable String name){
        System.out.println(id+":"+name);
        return "index2";
    }


    @RequestMapping("show4/{id}")
    public String show4(@PathVariable String id, String name){
        System.out.println(id+":"+name);
        return "index2";
    }

    @GetMapping("show5")
    public String show5(){
        return "suibian/index3";
    }
}
