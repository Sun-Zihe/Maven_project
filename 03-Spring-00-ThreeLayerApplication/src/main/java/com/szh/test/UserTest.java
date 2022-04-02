package com.szh.test;

import com.szh.dao.impl.UserDaoMySQLImpl;
import com.szh.dao.impl.UserDaoOracleImpl;
import com.szh.service.impl.UserServiceImpl;
import org.junit.Test;

public class UserTest {
    @Test
    public void test(){
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoMySQLImpl());
        userService.useDateBase();
    }
}
