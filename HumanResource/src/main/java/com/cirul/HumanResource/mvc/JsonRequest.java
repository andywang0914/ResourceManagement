package com.cirul.HumanResource.mvc;

import com.cirul.HumanResource.entity.User;
import com.cirul.HumanResource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by andywang on 2018/2/26.
 */
@RestController
public class JsonRequest {
    @Autowired
    UserService userService;

    @RequestMapping(value="/**/*.jsonRequest",method = RequestMethod.POST,headers="content-type=application/json")
    @ResponseBody
    public void doJsonRequest(){
        System.out.println("Hello Spring Boot");
    }

}
