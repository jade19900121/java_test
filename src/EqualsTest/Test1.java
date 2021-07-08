package EqualsTest;

/**
 * @author fangjiulin
 * @date 2021/7/8 23:50
 */
public class Test1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println(a == b);


        Integer aaa = new Integer(5);
        Integer bbb = new Integer(5);
        System.out.println(aaa == bbb);
        System.out.println(aaa.equals(bbb));


        String str1 = new String("justice");
        String str2 = new String("justice");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        String str3;
        str3 = str1;
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
    }
}
