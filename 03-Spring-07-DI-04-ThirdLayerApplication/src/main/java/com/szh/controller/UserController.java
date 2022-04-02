package com.szh.controller;

import com.szh.entity.User;
import com.szh.service.UserService;
import com.szh.service.impl.UserServiceImpl;

import java.util.List;

public class UserController {
    private UserService userService = new UserServiceImpl();
    public List<User> findAll(){
        return userService.findAll();
    }

    public void setUserService(UserService userService){
        this.userService = userService;
    }
}
