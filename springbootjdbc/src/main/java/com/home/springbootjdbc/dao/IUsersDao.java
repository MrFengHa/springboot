package com.home.springbootjdbc.dao;

import com.home.springbootjdbc.pojo.Users;

import java.util.List;

/**
 * 文件描述
 * 用户dao
 * @Author 冯根源
 * @create 2020/5/18 11:12
 */
public interface IUsersDao {
    /**
     * 添加用户功能
     * @param users
     */
    void insertUser(Users users);

    /**
     * 查询所有用户
     * @return
     */
    List<Users> findAll();
}
