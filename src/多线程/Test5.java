package 多线程;

/**
 * @author fangjiulin
 * @date 2021/7/13 15:49
 */
public class Test5 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start(); // 启动新线程
    }

    static  class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("start new thread!");
        }
    }
}
