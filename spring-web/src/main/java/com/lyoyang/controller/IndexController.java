package com.lyoyang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yangbing
 * @Date: 2019/10/29 20:06
 * @Description:
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "A INDEX PAGE";
    }



}
