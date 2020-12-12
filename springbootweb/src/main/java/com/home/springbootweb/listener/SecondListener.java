package com.home.springbootweb.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 文件描述
 * 整合Listener2
 * @Author 冯根源
 * @create 2020/5/14 16:57
 */
public class SecondListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Listener2监听");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
