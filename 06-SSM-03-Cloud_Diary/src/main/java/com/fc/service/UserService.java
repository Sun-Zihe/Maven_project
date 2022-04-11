package com.fc.service;

import com.fc.entity.TbUser;
import org.springframework.web.servlet.ModelAndView;

public interface UserService {

    ModelAndView login(TbUser tbUser, Integer remember);

}
