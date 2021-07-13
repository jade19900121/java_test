package 多线程;

/**
 * @author fangjiulin
 * @date 2021/7/13 15:47
 */
public class Test {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start(); // 启动新线程
    }
    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("start new thread!");
        }
    }
}
