package Interface_test;

/**
 * @author fangjiulin
 * @date 2021/7/3 11:47
 */
public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("I am Cat,I can eat");
    }

    @Override
    public void sleep() {
        System.out.println("I am Cat,I can Sleep");
    }

    public void run(){
        System.out.println("I am Cat,I can Run");
    }

    public static void main(String[] args) {
        Cat a = new Cat();
        a.eat();
        a.sleep();
        a.run();
    }
}
