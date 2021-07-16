package 正则表达式;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author fangjiulin
 * @date 2021/7/16 9:50
 */
public class Test5 {
    public static void main(String[] args) {
        String res = "\\d{3,4}-\\d{7,8}";
        System.out.println("010-1234567".matches(res));
        System.out.println("020-9999999".matches(res));
        System.out.println("0755-7654321".matches(res));
        System.out.println("010 12345678".matches(res));
        System.out.println("A20-9999999".matches(res));
        System.out.println("0755-7654.321".matches(res));
        //如果我们规定一个7~8位数字的电话号码不能以0开头

        String res1 = "\\d{3,4}-[123456789]\\d{6,7}";
        System.out.println("020-0999999".matches(res1));
        System.out.println("0755-7654321".matches(res1));

        String res2 = "\\d{3,4}-[1-9]\\d{6,7}";
        System.out.println("020-0999999".matches(res2));
        System.out.println("0755-7654321".matches(res2));

        //分组匹配
        Pattern p = Pattern.compile("(\\d{3,4})\\-(\\d{7,8})");
        Matcher m = p.matcher("010-12345678");
        if (m.matches()) {
            String g1 = m.group(1);
            String g2 = m.group(2);
            System.out.println(g1);
            System.out.println(g2);
        } else {
            System.out.println("匹配失败!");
        }
    }
}
