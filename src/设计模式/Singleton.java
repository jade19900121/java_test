package 设计模式;

/**
 * @author fangjiulin
 * @version 1.0
 * @date 2021/7/6 0006 下午 6:48
 */
/*懒汉式*/
public class Singleton {
    private int id;
    private Singleton() {}
    private static Singleton single=null;
    //静态工厂方法
    public static Singleton getInstance() {
        System.out.println("程序运行到这里了");
        if (single == null) {
            single = new Singleton();
        }
        return single;
    }

    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        a.id = 100;
        Singleton b = Singleton.getInstance();
        if(a == b){
            System.out.println("创建的是同一个实例");
            System.out.println(b.id);
        }
    }
}
