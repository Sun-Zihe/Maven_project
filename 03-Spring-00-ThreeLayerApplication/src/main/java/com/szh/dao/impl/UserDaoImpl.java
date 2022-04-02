package com.szh.dao.impl;

import com.szh.dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void useDateBase() {
        System.out.println("连接数据库");
    }
}
