package com.lyoyang.controller;


import com.lyoyang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping("/main")
    public String index() {
        return userService.getUserInfo();
    }

}
