package com.lyoyang.config;


import com.lyoyang.BaseTest;
import com.lyoyang.entity.Student;
import com.lyoyang.entity.User;
import org.junit.Test;
import org.springframework.beans.BeanUtils;
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


    @Test
    public void test_copyUtil() {
        User user = new User();
        Student student = new Student();
        student.setId(12);
        student.setAge(23);
        student.setGender("male");
        student.setName("tom");
        BeanUtils.copyProperties(student, user);
        System.out.println(user);
    }


}
