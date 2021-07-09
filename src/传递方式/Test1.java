package 传递方式;

import 运算符.Test;

/**
 * @author fangjiulin
 * @version 1.0
 * @date 2021/7/9 0009 上午 11:58
 */
public class Test1 {

    public static void valueCrossTest(int age, float weight) {
        System.out.println("传入的age：" + age);
        System.out.println("传入的weight：" + weight);
        age = 33;
        weight = 89.5f;
        System.out.println("方法内重新赋值后的age：" + age);
        System.out.println("方法内重新赋值后的weight：" + weight);
    }

    public static void main(String[] args) {
        int a = 25;
        float w = 77.5f;
        valueCrossTest(a, w);
        System.out.println("方法执行后的age：" + a);
        System.out.println("方法执行后的weight：" + w);
    }
}
