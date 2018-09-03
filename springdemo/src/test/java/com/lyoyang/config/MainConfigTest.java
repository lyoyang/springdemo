package com.lyoyang.config;


import com.lyoyang.BaseTest;
import com.lyoyang.entity.User;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainConfigTest {

    @Test
    public void test_bean() {
        AnnotationConfigApplicationContext annotation = new AnnotationConfigApplicationContext(MainConfig.class);
        User user = (User) annotation.getBean(User.class);
        System.out.println(user);
        String[] beanNamesForType = annotation.getBeanNamesForType(User.class);
//        for(String name : beanNamesForType) {
//            System.out.println(name);
//        }
        String[] beanDefinitionNames = annotation.getBeanDefinitionNames();
        for(String beanName : beanDefinitionNames) {
            System.out.println(beanName);
        }
    }

}
