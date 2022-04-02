package com.tezt.servic;

import com.fc.entity.TbUser;

import java.util.Map;

public interface TbUserService {

    Map<String,Object> addUser(TbUser tbUser);
}
