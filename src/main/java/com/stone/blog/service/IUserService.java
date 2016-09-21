package com.stone.blog.service;

import com.stone.blog.bean.UserBean;

public interface IUserService {

    UserBean findUserByUserName(String userName);
    
}
