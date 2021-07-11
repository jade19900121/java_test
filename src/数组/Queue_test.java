package 数组;

import java.util.LinkedList;
import java.util.Queue;
import java.util.SortedMap;

/**
 * @author fangjiulin
 * @date 2021/7/11 23:02
 */
public class Queue_test {
    public static void main(String[] args) {
        Queue<String> q1 = new LinkedList<>();
        // 添加3个元素到队列:
        q1.add("zhangsan");
        q1.add("lisi");
        q1.add("wangwu");
        q1.offer("fangjl");
        System.out.println(q1);
        //获取队列首个元素，不删除
        System.out.println(q1.element());
        //获取首个元素，不删除。
        System.out.println(q1.peek());

        //获取首个元素，并删除
        q1.remove();
        System.out.println(q1);
        q1.poll();
        System.out.println(q1);
        q1.poll();
        q1.poll();
        //此时queue为空了
        System.out.println(q1);
        //调用删除，不会出异常
        q1.poll();
        System.out.println(q1);
        //调用删除，会出现异常
        try {
            String s = q1.remove();
            System.out.println("获取成功");
        } catch(Exception e) {
            System.out.println("获取失败");
        }
    }
}
