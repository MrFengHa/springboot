package com.home.springfreemarker.pojo;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/5/15 12:19
 */
public class Users {
    private String username;
    private String userSex;
    private String userAge;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public Users(String username, String userSex, String userAge) {
        this.username = username;
        this.userSex = userSex;
        this.userAge = userAge;
    }
}
