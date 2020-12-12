package com.home.springbootjdbc.service;

import com.home.springbootjdbc.pojo.Users;

import java.util.List;

/**
 * 文件描述
 * 用户服务层接口
 * @Author 冯根源
 * @create 2020/5/18 11:01
 */
public interface IUsersService {
    /**
     * 添加用户
     * @param users
     */
    void addUser(Users users);

    /**
     * 查询所有用户信息
     * @return
     */
    List<Users> findAll();
}
