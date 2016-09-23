package com.stone.blog.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.stone.blog.base.TestBase;
import com.stone.blog.bean.UserBean;

public class UserServiceImplTest extends TestBase {

    @Autowired
    private IUserService userService;

    @Test
    public void testFindUserByUserName() {
        UserBean userBean = userService.findUserByUserName("stone");
        System.out.println(userBean.getPassword());
        System.out.println(userBean.getPhone());
        Assert.assertNotNull(userBean);
    }

}
