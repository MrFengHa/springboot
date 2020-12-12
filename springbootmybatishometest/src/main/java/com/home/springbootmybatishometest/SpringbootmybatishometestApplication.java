package com.home.springbootmybatishometest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.home.springbootmybatishometest.mapper")//指定扫描接口与映射文件的包名
public class SpringbootmybatishometestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootmybatishometestApplication.class, args);
    }

}
