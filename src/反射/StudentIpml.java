package 反射;

/**
 * @author fangjiulin
 * @date 2022/5/15 23:38
 */
public class StudentIpml implements Student {

    @Override
    public void getName(String name) {
        System.out.println("My name is: " + name);
    }
}
