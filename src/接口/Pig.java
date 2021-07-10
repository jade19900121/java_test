package 接口;

/**
 * @author fangjiulin
 * @date 2021/7/3 11:53
 */
public class Pig implements Animal{

    @Override
    public void eat() {
        System.out.println("I am Pig,I can eat");
    }

    public static void main(String[] args) {
        Pig a = new Pig();
        a.eat();
        a.sleep();
    }
}
