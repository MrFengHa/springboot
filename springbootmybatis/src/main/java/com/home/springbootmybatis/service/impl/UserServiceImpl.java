package com.home.springbootmybatis.service.impl;

import com.home.springbootmybatis.mapper.UsersMapper;
import com.home.springbootmybatis.pojo.Users;
import com.home.springbootmybatis.pojo.UsersExample;
import com.home.springbootmybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 文件描述
 * 用户管理业务层
 *
 * @Author 冯根源
 * @create 2020/5/18 17:55
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UsersMapper usersMapper;

    /**
     * 添加用户
     *
     * @param users
     */
    @Override
    @Transactional
    public void addUser(Users users) {
        usersMapper.insert(users);
    }

    /**
     * 查询所有信息
     *
     * @return
     */
    @Override
    public List<Users> findUserAll() {
        UsersExample usersExample = new UsersExample();
        return usersMapper.selectByExample(usersExample);
    }

    /**
     * 根据id查询用户信息
     *
     * @param userid
     * @return
     */
    @Override
    public Users findById(Integer userid) {
        return usersMapper.selectByPrimaryKey(userid);
    }

    /**
     * 更新用户
     *
     * @param users
     */
    @Override
    @Transactional
    public void updateUser(Users users) {
        usersMapper.updateByPrimaryKey(users);
    }

    /**
     * 删除用户
     *
     * @param userid
     */
    @Transactional
    @Override
    public void deleteUser(Integer userid) {
        usersMapper.deleteByPrimaryKey(userid);
    }
}
