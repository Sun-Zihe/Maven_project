package com.szh.dao;

import com.szh.entity.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
}
