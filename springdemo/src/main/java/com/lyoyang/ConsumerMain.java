package com.lyoyang;

import com.lyoyang.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerMain {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("spring/spring-consumer.xml");
        UserService bean = app.getBean(UserService.class);
        String userInfo = bean.getUserInfo();
        System.out.println("调用完成");
        System.in.read();
    }


}
