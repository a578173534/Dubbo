package com.ggs.dubbo.service.impl;

import com.ggs.dubbo.model.User;
import com.ggs.dubbo.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {

        User user = new User(id, "kxf", 20);

        return user;
    }
}
