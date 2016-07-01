package com.stone.blog.mapper;

import com.stone.blog.bean.UserBean;

public interface UserMapper {
    
    UserBean findUserByUserName(String userName);

}
