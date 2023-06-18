package 运算符;

/**
 * @author fangjiulin
 * @version 1.0
 * @date 2021/7/6 0006 下午 4:49
 */
public class Test {
    //这是我的一个测试
    //这是我的一个测试
    public static void main(String[] args) {
        int i = 1;
        System.out.println(i++);
        System.out.println(i);

        int j = 1;
        System.out.println(++j);
        System.out.println(j);

        //逻辑运算符11
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!(a && b) = " + !(a && b));
    }
}
