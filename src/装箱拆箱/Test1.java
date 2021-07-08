package 装箱拆箱;

/**
 * @author fangjiulin
 * @date 2021/7/9 0:02
 */
public class Test1 {
    public static void main(String[] args) {
        Integer a = 10;
        int b = a;
        Integer i1 = 100;
        Integer i2 = 100;
        Integer i3 = 200;
        Integer i4 = 200;
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());
        System.out.println(i1 == i2);
        System.out.println(i3 == i4);
    }
}
