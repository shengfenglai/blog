package com.stone.blog.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.stone.blog.bean.UserBean;
import com.stone.blog.exception.BlogException;
import com.stone.blog.exception.ValidateException;
import com.stone.blog.service.IUserService;

@Controller
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("/user/login.shtml")
    public ModelAndView login(UserBean userBean,HttpServletResponse response) throws Exception {

        if (StringUtils.isBlank(userBean.getUserName())) {
            throw new ValidateException("userName不能为空");
        }
        if (StringUtils.isBlank(userBean.getPassword())) {
            throw new ValidateException("password不能为空");
        }

        UserBean user = userService.findUserByUserName(userBean.getUserName());

        if (userBean != null) {
            if (!userBean.getPassword().equals(user.getPassword())) {
                throw new BlogException("密码不正确");
            }
        }

        return new ModelAndView("/WEB-INF/page/index.html");

    }

}
