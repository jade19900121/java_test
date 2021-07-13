package 多线程;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.awt.*;

/**
 * @author fangjiulin
 * @date 2021/7/13 11:34
 */
public class TongBuMethod {
    private int count = 0;

    public void add(int n) {
        synchronized (this) {
            count += n;
        }
    }

    public void dec(int n) {
        synchronized (this) {
            count -= n;
        }
    }

    public int get() {
        return count;
    }

    public static void main(String[] args) throws InterruptedException {

        TongBuMethod a1 = new TongBuMethod();
        Thread t1 = new Thread(() -> {
            a1.add(100);
        });
        t1.start();

        Thread t2 = new Thread(() -> {
            a1.dec(100);
            ;
        });
        t2.start();
        t1.join();
        t2.join();
        System.out.println(a1.count);

    }

}
