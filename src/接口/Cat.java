package 接口;

/**
 * @author fangjiulin
 * @date 2021/7/3 11:47
 */
public class Cat implements Animal{
    private int number;

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

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();
        a.sleep();
        System.out.println(a.id);
        System.out.println("\n");

        Cat b = new Cat();
        b.eat();
        b.sleep();
        b.run();
        b.setNumber(b.id);
        System.out.println(b.getNumber());
    }



}
