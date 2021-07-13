package 多线程;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author fangjiulin
 * @date 2021/7/13 16:21
 */
public class TaskQueue {
    Queue<String> queue = new LinkedList<>();

    public void addTask(String s) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + "，run prepare");
            System.out.println(Thread.currentThread().getName() + ",拿到this锁");
            this.queue.add(s);
            this.notify(); // 唤醒在this锁等待的线程
        }
    }

    public synchronized String getTask() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "，run prepare");
        while (queue.isEmpty()) {
            System.out.println("队列为空，目前拿到了this锁，需要释放");
            this.wait();
        }
        return this.queue.remove();
    }

    public static void main(String[] args) throws InterruptedException {

        TaskQueue task1 = new TaskQueue();
        System.out.println("最开始的元素:" + task1.queue);

        Thread t1 = new Thread(() -> {
            task1.addTask("hundsun");
        });
        Thread t2 = new Thread(() -> {
            String value = null;
            try {
                value = task1.getTask();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("获取的元素是:" + value);
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("end");

    }
}
