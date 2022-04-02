package com.szh.service.impl;

import com.szh.dao.UserDao;
import com.szh.dao.impl.UserDaoMySQLImpl;
import com.szh.entity.User;
import com.szh.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService{
    private UserDao userDao = new UserDaoMySQLImpl();


    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }
}
