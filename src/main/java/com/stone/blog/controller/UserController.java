package com.stone.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.stone.blog.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    
    
    
}
