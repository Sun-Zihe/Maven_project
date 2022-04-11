package com.fc.controller;

import com.fc.entity.User;
import com.fc.service.UserService;
import com.fc.vo.ReturnMessageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin("*")
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "add",method = RequestMethod.POST)
    public ReturnMessageVO add(User user){
        return userService.add(user);
    }

    @RequestMapping(value = "getlist",method = RequestMethod.GET)
    public ReturnMessageVO getlist(@RequestParam(value = "pageNo"   , defaultValue = "1") Integer pageNo,
                                   @RequestParam(value = "pageSize" , defaultValue = "3") Integer pageSize,
                                   @RequestParam(value = "id",required = false) Long id){
        return userService.getlist(pageNo,pageSize,id);
    }

    @RequestMapping(value = "update" ,method = RequestMethod.POST)
    public ReturnMessageVO update(User user){
        return  userService.update(user);
    }

    @RequestMapping(value = "del",method = RequestMethod.POST)
    public ReturnMessageVO del(Long id){
        return userService.del(id);
    }


}
