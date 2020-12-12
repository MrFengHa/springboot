package com.home.springbootweb.config;

import com.home.springbootweb.filter.SecondFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 文件描述
 * Filter配置类
 * @Author 冯根源
 * @create 2020/5/14 16:49
 */
@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean getFilterRegistrationBean(){
        FilterRegistrationBean bean = new FilterRegistrationBean(new SecondFilter());
        //bean.addUrlPatterns(new String[]{"*.do"});
        bean.addUrlPatterns("/second");
        return bean;
    }
}
