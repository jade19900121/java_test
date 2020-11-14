package animals;

/**
 * @author fangjiulin
 * @date 2020/11/14 14:32
 */
public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("I am Dog,I can eat");
    }

    @Override
    public void sleep() {
        System.out.println("I am Dog,I can sleep");
    }

    public void run(){
        System.out.println("I am Dog,I can run");;
    }

    public static void main(String[] args) {
        Dog a = new Dog();
        a.eat();
        a.sleep();
        a.run();
    }
}
