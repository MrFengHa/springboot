package com.home.springbootmybatis.service;

import com.home.springbootmybatis.pojo.Users;

import java.util.List;

/**
 * 文件描述
 * 用户服务层接口
 *
 * @Author 冯根源
 * @create 2020/5/18 17:54
 */
public interface IUserService {
    /**
     * 添加用户
     *
     * @param users
     */
    void addUser(Users users);

    /**
     * 查询所有用户信息
     *
     * @return
     */
    List<Users> findUserAll();

    /**
     * 根据Id查询用户信息
     *
     * @param userid
     * @return
     */
    Users findById(Integer userid);

    /**
     * 更新用户信息
     *
     * @param users
     */
    void updateUser(Users users);

    /**
     * 删除用户
     *
     * @param userid
     */
    void deleteUser(Integer userid);
}
