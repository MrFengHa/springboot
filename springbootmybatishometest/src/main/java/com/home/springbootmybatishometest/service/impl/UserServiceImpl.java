package com.home.springbootmybatishometest.service.impl;

import com.home.springbootmybatishometest.mapper.UsersMapper;
import com.home.springbootmybatishometest.pojo.Users;
import com.home.springbootmybatishometest.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 文件描述
 *
 * @author 冯根源
 * @date 2020/5/19 23:05
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UsersMapper usersMapper;
    @Override
    public void addUser(Users users) {
        usersMapper.insert(users);
    }
}
