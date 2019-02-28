package com.lyoyang.controller;


import com.lyoyang.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class IndexController {

    @Resource
    private UserService userService;

    @RequestMapping("/main")
    public String index() {
        return userService.getUserInfo();
    }

}
