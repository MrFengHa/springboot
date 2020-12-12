package com.home.springbootjdbc.service.impl;

import com.home.springbootjdbc.dao.IUsersDao;
import com.home.springbootjdbc.pojo.Users;
import com.home.springbootjdbc.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 文件描述
 * 用户服务层实现类
 *
 * @Author 冯根源
 * @create 2020/5/18 11:02
 */
@Service
public class UserServiceImpl implements IUsersService {
    @Autowired
    private IUsersDao usersDao;

    /**
     * 添加用户
     *
     * @param users
     */
    @Override
    @Transactional
    public void addUser(Users users) {

        this.usersDao.insertUser(users);
    }

    /**
     * 查询所有用户信息
     * @return
     */
    @Override
    public List<Users> findAll() {
        return usersDao.findAll();
    }
}
