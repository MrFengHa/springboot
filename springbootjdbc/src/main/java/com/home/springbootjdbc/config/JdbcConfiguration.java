package com.home.springbootjdbc.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * 文件描述
 * 数据源的JDBC配置类
 * @Author 冯根源
 * @create 2020/5/16 16:08
 */
//@Configuration
/*加载指定的Properties配置文件*/
//@PropertySource("classpath:/jdbc.properties")
//@Configuration
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfiguration {
//    @Value("${jdbc.driverClassName}")
//    private String driverClassName;
//    @Value("${jdbc.url}")
//    private String url;
//    @Value("${jdbc.username}")
//    private String username;
//    @Value("${jdbc.password}")
//    private String password;
//    @Autowired
//    private JdbcProperties jdbcProperties;
    /**
     * 实例化Druid
     */
    //@Bean
    //@ConfigurationProperties(prefix = "jdbc")
    public DataSource getDataSource(){
        DruidDataSource source = new DruidDataSource();

        return source;
    }
}
