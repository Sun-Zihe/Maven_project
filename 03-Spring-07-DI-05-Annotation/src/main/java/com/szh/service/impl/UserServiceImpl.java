package com.szh.service.impl;

import com.szh.dao.UserDao;
import com.szh.dao.impl.UserDaoMySQLImpl;
import com.szh.entity.User;
import com.szh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

//一般用在业务层，和 Component 的效果一样,用于把当前类对象存入Spring容器中。
@Service
public class UserServiceImpl implements UserService{
    //根据数据类型进行注入
    @Autowired
    // 在数据类型相同的情况下，再根据id进行注入
    @Qualifier("userDaoMySQLImpl")
    private UserDao userDao;



    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
