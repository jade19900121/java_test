package 多线程;

/**
 * @author fangjiulin
 * @date 2021/7/13 12:39
 */
public class DeadLock2 {
    static Object objA = new Object();
    static Object objB = new Object();

    public static class MyThread implements Runnable {
        public void run() {
            System.out.println(Thread.currentThread().getName() + "，run prepare");
            synchronized (objA) {// obj锁
                System.out.println(Thread.currentThread().getName() + ",拿到objA锁");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (objB) {
                    System.out.println(Thread.currentThread().getName() + ",拿到objB锁");
                }
            }

//            synchronized (objB) {
//                System.out.println(Thread.currentThread().getName() + ",拿到objB锁");
//            }

        }
    }

    public static class MyThread2 implements Runnable {
        public void run() {
            System.out.println(Thread.currentThread().getName() + "run prepare");
            synchronized (objB) {// obj锁
                System.out.println(Thread.currentThread().getName() + "，拿到 objB锁");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (objA) {
                    System.out.println(Thread.currentThread().getName() + "，拿到 objA锁");
                }
            }
//            synchronized (objA) {
//                System.out.println(Thread.currentThread().getName() + "，拿到 objA锁");
//            }
        }
    }

    public static void main(String[] args) {
        Thread th = new Thread(new MyThread());
        Thread th2 = new Thread(new MyThread2());
        th.start();
        th2.start();
    }
}

