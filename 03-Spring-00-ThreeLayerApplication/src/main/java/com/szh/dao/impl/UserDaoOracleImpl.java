package com.szh.dao.impl;

import com.szh.dao.UserDao;

public class UserDaoOracleImpl implements UserDao {
    @Override
    public void useDateBase() {
        System.out.println("使用Oracle链接数据库");
    }
}
