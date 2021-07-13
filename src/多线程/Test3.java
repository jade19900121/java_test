package 多线程;

/**
 * @author fangjiulin
 * @date 2021/7/12 23:22
 */
public class Test3 {
    //main线程在启动t线程后，可以通过t.join()等待t线程结束后再继续运行
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("hello");
        });
        System.out.println("start");
        t.start();
        t.join();
        System.out.println("end");
    }
}
