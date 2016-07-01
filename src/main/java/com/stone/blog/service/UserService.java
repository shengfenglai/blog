package com.stone.blog.service;

import com.stone.blog.bean.UserBean;

public interface UserService {

    UserBean findUserByUserName(String userName);
    
}
