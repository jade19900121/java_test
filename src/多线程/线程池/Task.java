package 多线程.线程池;

/**
 * @author fangjiulin
 * @date 2021/7/13 17:42
 */
public class Task implements Runnable{
    private final String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("start task " + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println("end task " + name);
    }
}
