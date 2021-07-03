package Class_Test;

/**
 * @author fangjiulin
 * @date 2021/7/3 19:19
 */
public class Dog extends Animal {
    private int age;

//    public Dog(String name, int id) {
//        super(name, id);
//    }

    public Dog(String name, int id, int age,String sex) {
        super(name, id);
        this.age = age;
        this.sex = sex;
    }

    @Override
    public void eat() {
        //super.eat();
        System.out.println("I am Dog,I can eat");
    }

    @Override
    public void sleep() {
        //super.sleep();
        System.out.println("I am Dog,I can sleep");
    }

    //父类的方法修饰为了final，子类不能重写
//    @Override
//    public void drink() {
//        super.drink();
//    }

    public void run() {
        System.out.println("I am Dog,I can run");
    }


    public static void main(String[] args) {
        Dog test1 = new Dog("狗子", 18854, 3,"母");
        //子类调用自己的属性
        System.out.println("我的年龄是:" + test1.age);

        //父类的控制符是public，子类能够调用
        System.out.println("我的名字是:" + test1.name);

        //父类的控制符是private，子类不能调用
        //System.out.println("我的id是:" + test1.id);

        //父类的控制符是protected,子类能调用
        System.out.println(test1.sex);

        test1.run();
        test1.eat();
        test1.sleep();
    }
}
