package com.example.fangtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fangjiulin
 * @date 2021/7/19 19:59
 */
@Configuration
@ComponentScan
public class testMain1 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(testMain1.class);
        User user = context.getBean(User.class);
        user.setAge(31);
        user.setName("fangjiulin");
        //调用方法
        System.out.println(user.toString());
    }
}
