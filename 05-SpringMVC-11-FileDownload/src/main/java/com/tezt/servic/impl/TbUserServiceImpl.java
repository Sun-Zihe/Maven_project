package com.tezt.servic.impl;

import com.fc.dao.TbUserMapper;
import com.fc.entity.TbUser;
import com.fc.service.TbUserService;

import java.util.HashMap;
import java.util.Map;

public class TbUserServiceImpl implements TbUserService {

    TbUserMapper userMapper;

    @Override
    public Map<String, Object> addUser(TbUser tbUser) {

        int affectedRows = userMapper.addUser(tbUser);

        Map<String, Object> map = new HashMap<>();

        if (affectedRows > 0) {
            map.put("code", 200);
            map.put("message", "成功了");
            map.put("success", true);
        }else{
            map.put("code", -1);
            map.put("message", "失败了");
            map.put("success", false);
        }

        return map;
    }
}
