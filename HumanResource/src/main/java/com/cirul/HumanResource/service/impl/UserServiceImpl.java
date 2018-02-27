package com.cirul.HumanResource.service.impl;

import com.cirul.HumanResource.dao.UserDAO;
import com.cirul.HumanResource.entity.User;
import com.cirul.HumanResource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by andywang on 2018/2/27.
 */
@Qualifier
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    public User addUser(User u){
        return userDAO.save(u);
    }

    public User getById(Integer id){
        return userDAO.getById(id);
    }


}
