package com.szh.service.impl;

import com.szh.dao.UserDao;
import com.szh.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Override
    public void useDateBase() {
        userDao.useDateBase();
    }

    @Override
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
