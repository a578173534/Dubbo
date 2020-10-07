package com.ggs.dubbo.service.impl;

import com.ggs.dubbo.model.User;
import com.ggs.dubbo.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user = new User(id, "kxf");
        return user;
    }

    @Override
    public Integer queryAllUserCount() {
        return 52;
    }
}
