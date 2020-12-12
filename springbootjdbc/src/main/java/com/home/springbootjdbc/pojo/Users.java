package com.home.springbootjdbc.pojo;

/**
 * 文件描述
 * 用户实体类
 * @Author 冯根源
 * @create 2020/5/18 10:08
 */
public class Users {
    private Integer userId;
    private String userName;
    private String userSex;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }
}
