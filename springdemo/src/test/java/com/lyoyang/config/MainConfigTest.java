package com.lyoyang.config;


import com.lyoyang.BaseTest;
import com.lyoyang.entity.Student;
import com.lyoyang.entity.User;
import org.junit.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

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
        User user = null;
        Student student = new Student();
        student.setId(12);
        student.setAge(23);
        student.setGender("male");
        student.setName("tom");
        BeanUtils.copyProperties(student, user);
        System.out.println(user);
    }

    @Test
    public void test_listCopy() {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student(1, "jim", 12, "male");
        Student s2 = new Student(2, "bob", 13, "male");
        Student s3 = new Student(3, "alice", 16, "female");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        User user = new User();
        for(int i = 0; i<list.size(); i++) {
            BeanUtils.copyProperties(list.get(i), user);
            System.out.println(user);
        }
    }


}
