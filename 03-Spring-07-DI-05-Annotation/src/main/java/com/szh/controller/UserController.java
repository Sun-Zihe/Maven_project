package com.szh.controller;

import com.szh.entity.User;
import com.szh.service.UserService;
import com.szh.service.impl.UserServiceImpl;
import com.szh.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {

    //自动装配，注解Autowired自动按照类型注入，
    // 会从容器中找到对应的数据类型进行注入，主要针对引入数据类型
    @Autowired
    private UserService userService;

    public List<User> findAll(){ return userService.findAll();}
}
