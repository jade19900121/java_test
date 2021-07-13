package 多线程.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author fangjiulin
 * @date 2021/7/13 17:43
 */
public class Test1 {
    public static void main(String[] args) {
        // 创建一个固定大小的线程池:
        ExecutorService es = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 6; i++) {
            es.submit(new Task("" + i));
        }
        // 关闭线程池:
        es.shutdown();
    }
}
