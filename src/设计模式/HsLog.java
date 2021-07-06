package 设计模式;

/**
 * @author fangjiulin
 * @date 2021/7/6 22:26
 */
public class HsLog {
    public HsLog() {
        System.out.println("呵呵呵");
    }

    public static HsLog singleton = new HsLog();  //建立对象

    public static HsLog getInstance() {
        System.out.println("2222");
        return singleton;//直接返回单例对象
    }

    public static void print_log(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
//        Singleton1 a = Singleton1.getInstance();
//        Singleton1 b = Singleton1.getInstance();
//        //Singleton1 b = new Singleton1();
//        if (a == b) {
//            System.out.println("两者相等");
//        }

    }
}
