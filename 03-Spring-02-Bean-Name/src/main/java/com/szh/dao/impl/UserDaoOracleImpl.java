package com.szh.dao.impl;

import com.szh.dao.UserDao;

public class UserDaoOracleImpl implements UserDao {
    @Override
    public void findAll() {
        System.out.println("使用OracleImpl");
    }
}
