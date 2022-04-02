package com.szh.dao.impl;

import com.szh.dao.UserDao;
import com.szh.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public List<User> findAll(){
        //链接
        ArrayList<User> users = new ArrayList<>();

        users.add(new User(1,"张三","123"));
        users.add(new User(2,"张三","123"));
        users.add(new User(3,"张三","123"));

        return users;
    }
}
