package com.stone.blog.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stone.blog.bean.UserBean;
import com.stone.blog.exception.BlogException;
import com.stone.blog.service.IUserService;

@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/user/login.htm")
    public void login(HttpServletRequest request) throws Exception {
        final String userName = request.getParameter("userName");
        final String password = request.getParameter("password");

        if(StringUtils.isNotBlank(userName)) {
            throw new BlogException("userName不能为空");
        }
        if(StringUtils.isNotBlank(password)) {
            throw new BlogException("password不能为空");
        }
        
        UserBean userBean = userService.findUserByUserName(userName);
        
        if(userBean != null) {
            
        }
        
        
    }
}
