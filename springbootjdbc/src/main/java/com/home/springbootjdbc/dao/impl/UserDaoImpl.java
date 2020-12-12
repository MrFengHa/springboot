package com.home.springbootjdbc.dao.impl;

import com.home.springbootjdbc.dao.IUsersDao;
import com.home.springbootjdbc.pojo.Users;
import com.home.springbootjdbc.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * 文件描述
 * 用户dao实现类
 * @Author 冯根源
 * @create 2020/5/18 11:16
 */
@Repository
public class UserDaoImpl implements IUsersDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 添加用户
     * @param users
     */
    @Override
    public void insertUser(Users users) {
        String sql ="insert into users(username,usersex) values(?,?)";
        this.jdbcTemplate.update(sql,users.getUserName(),users.getUserSex());

    }

    /**
     * 查询全部用户
     * @return
     */
    @Override
    public List<Users> findAll() {
        String sql = "select * from users";

        return this.jdbcTemplate.query(sql, new RowMapper<Users>() {
            /**
             * 结果集映射
             * @param resultSet
             * @param i
             * @return
             * @throws SQLException
             */
            @Override
            public Users mapRow(ResultSet resultSet, int i) throws SQLException {
                Users users = new Users();
                users.setUserId(resultSet.getInt("useId"));
                users.setUserName(resultSet.getString("userName"));
                users.setUserSex(resultSet.getString("userSex"));
                return users;
            }
        });
    }
}
