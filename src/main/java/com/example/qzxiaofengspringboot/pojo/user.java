package com.example.qzxiaofengspringboot.pojo;

public class user {
    private Integer userId;
    private String username;
    private String password;

    public user(){

    }
    public user(Integer userId,String username,String password){
        this.userId=userId;
        this.username=username;
        this.password=password;
    }

    public Integer getUserId() {
        return userId;
    }public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString() {
        return "user [password=" + password + ", userId=" + userId + ", username=" + username + "]";
    }

    
    
    
}
