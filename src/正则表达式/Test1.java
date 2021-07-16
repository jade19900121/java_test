package 正则表达式;

/**
 * @author fangjiulin
 * @date 2021/7/15 22:31
 */
public class Test1 {
    //匹配年份
    public static void main(String[] args) {
        String regex = "20\\d\\d";
        System.out.println("2019".matches(regex)); // true
        System.out.println("2100".matches(regex)); // false

        String regex1 = "20\\D";
        System.out.println("20W".matches(regex1)); // true
        System.out.println("20P".matches(regex1)); // false
    }
}
