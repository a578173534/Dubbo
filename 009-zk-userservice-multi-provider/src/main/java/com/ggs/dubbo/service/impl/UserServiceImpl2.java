package com.ggs.dubbo.service.impl;

import com.ggs.dubbo.model.User;
import com.ggs.dubbo.service.UserService;

public class UserServiceImpl2 implements UserService {

    public User queryUserById(Integer id, String username) {
        User user = new User(id, username + "-2");
        return user;
    }
}
