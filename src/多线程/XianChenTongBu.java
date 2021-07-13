package 多线程;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author fangjiulin
 * @date 2021/7/13 9:32
 */
public class XianChenTongBu {
    public static void main(String[] args) throws InterruptedException {
        Thread add = new AddThread();
        Thread dec = new DecThread();
        add.start();
        dec.start();
        add.join();
        dec.join();
        //主线程打印最终的结果
        //Thread.sleep(1000);
        System.out.println(Counter.count);
    }
}

class Counter {
    public static int count = 0;
    public static final Object lock = new Object();
}

class AddThread extends Thread {
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (Counter.lock){
                Counter.count += 1;
            }

        }
    }
}

class DecThread extends Thread {
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (Counter.lock){
                Counter.count -= 1;
            }

        }
    }
}
