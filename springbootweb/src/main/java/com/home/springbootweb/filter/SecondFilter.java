package com.home.springbootweb.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 文件描述
 * 整合Filter方式2
 * @Author 冯根源
 * @create 2020/5/14 16:47
 */
public class SecondFilter implements Filter {
    @Override
    public void init(FilterConfig config) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("进入Second Filter");
        chain.doFilter(req,resp);
        System.out.println("离开Second Filter");
    }

    @Override
    public void destroy() {

    }

}
