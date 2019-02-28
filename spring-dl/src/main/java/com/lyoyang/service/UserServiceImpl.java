package com.lyoyang.service;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    public String getUserInfo() {
        return "hello dubbo";
    }
}
