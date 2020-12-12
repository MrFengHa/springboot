package com.home.springbootmybatishometest.service;

import com.home.springbootmybatishometest.pojo.Users;

/**
 * 文件描述
 * 用户
 * @author 冯根源
 * @date 2020/5/19 23:04
 */
public interface IUserService {
    /**
     * 添加用户
     * @param users
     */
    void addUser(Users users);
}
