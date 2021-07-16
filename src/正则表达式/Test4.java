package 正则表达式;

/**
 * @author fangjiulin
 * @date 2021/7/15 22:48
 */
public class Test4 {
    //重复匹配
    public static void main(String[] args) {
        String res = "A\\d*";
        System.out.println("A".matches(res));
        System.out.println("A0".matches(res));
        System.out.println("A12".matches(res));
        System.out.println("A123".matches(res));

        //修饰符+可以匹配至少一个字符。我们用A\d+可以匹配
        String res1 = "A\\d+";
        System.out.println("A".matches(res1));
        System.out.println("A1".matches(res1));

        //修饰符?可以匹配0个或一个字符。我们用A\d?可以匹配
        String res2 = "A\\d?";
        System.out.println("A".matches(res2));
        System.out.println("A2".matches(res2));
        System.out.println("A23".matches(res2));


    }
}
