package com.home.springbootweb.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 *文件描述
 * 整合Filter方式1
 *@author 冯根源
 *@date 2020/5/14 16:39
 */
@WebFilter(filterName = "FirstFilter", urlPatterns = "/first")
public class FirstFilter implements Filter {
    @Override
    public void init(FilterConfig config) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("进入First Filter");
        chain.doFilter(req,resp);
        System.out.println("离开First Filter");
    }

    @Override
    public void destroy() {

    }

}
