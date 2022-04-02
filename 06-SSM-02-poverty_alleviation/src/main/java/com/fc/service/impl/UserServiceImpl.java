package com.fc.service.impl;

import com.fc.dao.UserMapper;
import com.fc.entity.User;
import com.fc.entity.com.fc.error.Data;
import com.fc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Map<String, Object> add(User user) {

        int affectedRows = userMapper.insertSelective(user);

        Map<String, Object> map = new HashMap<>();

        if (affectedRows > 0) {
            map.put("code", 200);
            map.put("message", "用户添加成功");
            map.put("success", true);
            map.put("data",null);
        }else{
            map.put("code", 400);
            map.put("message", "用户添加失败");
            map.put("success", false);
            map.put("data",new Data() {
                String errMsg = "错误信息";
            });
        }

        return map;
    }
}
