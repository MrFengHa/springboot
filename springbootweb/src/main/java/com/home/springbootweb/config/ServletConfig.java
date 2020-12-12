package com.home.springbootweb.config;

import com.home.springbootweb.servlet.SecondServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 文件描述
 * Servlet配置类
 * @Author 冯根源
 * @create 2020/5/14 16:33
 */
@Configuration
public class ServletConfig {
    /**
     * 完成Servlet组件的注册
     * @return
     */
    @Bean
    public ServletRegistrationBean getServletRegistrationBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServlet());
        bean.addUrlMappings("/second");
        return bean;
    }
}
