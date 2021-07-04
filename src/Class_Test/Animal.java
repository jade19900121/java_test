package Class_Test;

/**
 * @author fangjiulin
 * @date 2021/7/3 19:15
 */
public class Animal {
    public String name;
    private int id;
    protected final String sex = "公";

    public Animal(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void eat() {
        System.out.println("I am animal,I can eat");
    }

    public void sleep() {
        System.out.println("I am animal,I can sleep");
    }

    public final void drink() {
        System.out.println("I am animal,I can drink water");
    }

    //private类型，不能被子类重写
    private void introduction() {
        System.out.println("大家好我是:" + name);
    }

    void introduction1() {
        System.out.println("大家好我是: " + name);
    }

    public static void main(String[] args) {
        Animal test1 = new Animal("贝贝", 10);
        test1.eat();
        test1.sleep();
        test1.introduction();
        System.out.println(test1.name);
        System.out.println(test1.id);
    }

}
