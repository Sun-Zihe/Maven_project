package com.szh.dao.impl;

import com.szh.dao.UserDao;

public class UserDaoMySQLImpl implements UserDao {
    @Override
    public void useDateBase() {
        System.out.println("使用 MySql链接数据库");
    }
}
