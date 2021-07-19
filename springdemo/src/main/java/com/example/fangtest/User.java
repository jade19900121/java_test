package com.example.fangtest;

import org.springframework.stereotype.Component;

/**
 * @author fangjiulin
 * @date 2021/7/19 18:32
 */
@Component
public class User {
    private String name;
    private  int  age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "User [name=" + name + ", age=" + age + "]";
    }
}
