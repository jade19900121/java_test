package 正则表达式;

/**
 * @author fangjiulin
 * @date 2021/7/15 22:33
 */
public class Test2 {
    public static void main(String[] args) {
        String re1 = "abc";
        System.out.println("abc".matches(re1));
        System.out.println("Abc".matches(re1));
        System.out.println("abcd".matches(re1));

        String re2 = "a\\&c"; // 对应的正则是a\&c
        System.out.println("a&c".matches(re2));
        System.out.println("a-c".matches(re2));
        System.out.println("a&&c".matches(re2));

        String re3 = "a.c";//.可以代表任意字符，只能是一个
        System.out.println("a&c".matches(re2));
        System.out.println("a-c".matches(re2));
        System.out.println("a&&c".matches(re2));
        System.out.println("abc".matches(re2));

    }
}
