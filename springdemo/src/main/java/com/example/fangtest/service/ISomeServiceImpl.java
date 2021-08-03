package com.example.fangtest.service;

/**
 * @author fangjiulin
 * @date 2021/7/19 22:04
 */
public class ISomeServiceImpl implements ISomeSerice {
    public ISomeServiceImpl() {
        System.out.println("无参构造器被执行");
    }

    public ISomeServiceImpl(int a) {
        System.out.println("无参构造器被执行" + a);
    }

    @Override
    public String doFirst() {
        System.out.println("执行doFirst");
        return "hello spring";
    }

    @Override
    public void doSecond() {
        System.out.println("执行doSecond");
    }

    //普通方法，需要注册
    public void initAfter() {
        System.out.println("初始化之后");
    }

    public void perDestroy() {
        System.out.println("销毁之前");
    }

}
