package 反射;

/**
 * @author fangjiulin
 * @date 2022/5/15 23:40
 */
public class Test5 {
    public static void main(String[] args) {
        Student student = new StudentIpml();
        student.getName("慕欧");

        //反射调用
        System.out.println(student.getClass());
    }
}
