package 多线程;

/**
 * @author fangjiulin
 * @date 2021/7/12 23:03
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println("main start...");
        Thread t = new Thread() {
            public void run() {
                System.out.println("thread run...");
                System.out.println("thread end.");
            }
        };
        t.start();
        System.out.println("main end...");
    }
}
