package com.stone.blog.mapper;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.stone.blog.base.TestBase;
import com.stone.blog.bean.UserBean;


public class UserMapperTest extends TestBase {
    
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFindUserByUserName() {
        UserBean userBean = userMapper.findUserByUserName("stone");
        System.out.println(userBean.getPassword());
        System.out.println(userBean.getPhone());
        Assert.assertNotNull(userBean);
    }

}
