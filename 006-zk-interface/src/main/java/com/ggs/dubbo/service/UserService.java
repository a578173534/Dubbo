package com.ggs.dubbo.service;

import com.ggs.dubbo.model.User;

public interface UserService {

    /**
     * 根据用户标识获取用户的信息
     *
     * @param id
     * @param username
     * @return
     */
    User queryUserById(Integer id, String username);
}
