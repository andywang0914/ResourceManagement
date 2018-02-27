package com.cirul.HumanResource.service;

import com.cirul.HumanResource.entity.User;

import java.util.List;

/**
 * Created by andywang on 2018/2/27.
 */
public interface UserService {
    User addUser(User u);
    User getById(Integer id);
}
