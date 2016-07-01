package com.stone.blog.service.impl;

import com.stone.blog.bean.UserBean;
import com.stone.blog.mapper.UserMapper;
import com.stone.blog.service.UserService;

public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    @Override
    public UserBean findUserByUserName(String userName) {
        return userMapper.findUserByUserName(userName);
    }

}
