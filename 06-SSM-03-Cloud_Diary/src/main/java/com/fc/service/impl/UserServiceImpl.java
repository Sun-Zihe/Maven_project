package com.fc.service.impl;

import com.fc.dao.TbUserMapper;
import com.fc.entity.TbUser;
import com.fc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

public class UserServiceImpl implements UserService {

    @Autowired
    private TbUserMapper userMapper;

    @Override
    public ModelAndView login(TbUser tbUser, Integer remember) {

        int affRow = userMapper.selectByParma(tbUser);

        //如果查到了
        if (affRow>0){
            //存入session
            //mv视图跳转成功页
        }else {
            //mv视图跳转失败页面
        }

        return null;
    }
}
