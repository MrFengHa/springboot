package com.home.springbootweb.listener; /**
 * 文件描述
 * 整合Listener
 * @Author 冯根源
 * @create 2020/5/14 16:54
 */

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener()
public class FirstListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("初始化对象Listener");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }

}
