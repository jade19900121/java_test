package com.example.fangtest;

import com.example.fangtest.service.ISomeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fangjiulin
 * @date 2021/7/19 22:07
 */
public class testMain2 {
    public static void main(String[] args) {
        //创建Spring上下文（加载spring-config.xml）
        ApplicationContext acx = new ClassPathXmlApplicationContext("spring-config.xml");
        //获取User实例
        ISomeServiceImpl iSomeService  = acx.getBean(ISomeServiceImpl.class);
        String result = iSomeService.doFirst();
        System.out.println(result);
        iSomeService.doSecond();
        //  销毁方法的执行有两个要求
        //  一、被销毁的对象要是singleton，即单例的（默认就是单例的）
        //  二、容器要被显示的关闭（ApplicationContext没有close方法，但它的实现类有）
        ((ClassPathXmlApplicationContext) acx).close();;
    }
}
