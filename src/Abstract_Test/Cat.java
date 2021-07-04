package Abstract_Test;

/**
 * @author fangjiulin
 * @date 2021/7/3 22:41
 */
public class Cat extends Animal{

    @Override
    public void eat() {
        //super.eat();
        System.out.println("我是猫，我吃鱼");
    }
}
