package com.szh.dao.impl;

import com.szh.dao.UserDao;
import com.szh.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("userDaoMySQLImpl")
public class UserDaoMySQLImpl implements UserDao {
    @Override
    public List<User> findAll() {
        //链接
        ArrayList<User> users = new ArrayList<>();

        users.add(new User(1,"雷神","123"));
        users.add(new User(2,"风神","123"));
        users.add(new User(3,"岩神","123"));
        users.add(new User(4,"草神","123"));

        return users;
    }
}
