package 抽象类;

/**
 * @author fangjiulin
 * @date 2021/7/3 22:37
 */
public abstract class Animal {
    public String name;
    public int id;
    public int age;

    public abstract void eat();

    public static void sleep(){
        System.out.println("我是动物，我可以睡觉哦");
    }

}
