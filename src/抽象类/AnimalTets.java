package 抽象类;

/**
 * @author fangjiulin
 * @date 2021/7/3 22:42
 */
public class AnimalTets {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();
        a.sleep();

        Animal b = new Dog();
        b.eat();


    }
}
