package com.cirul.HumanResource.controller;

import com.cirul.HumanResource.entity.User;
import com.cirul.HumanResource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by andywang on 2018/2/27.
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/addUser")
    @ResponseBody
    public User addUser(){
        User u = new User();
        u.setId(8);
        u.setLoginName("loginName2");
        u.setPassword("password");
        u.setName("Test user name");
        u.setJwtToken("JWT");
        u.setCreateTime(System.nanoTime());
        return userService.addUser(u);
    }
}
