package 数组;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author fangjiulin
 * @date 2021/7/3 11:21
 */
public class Iterator_test {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        // 获取迭代器
        Iterator<String> it = sites.iterator();

        // 输出集合中的第一个元素
        while (it.hasNext()) {
            String a = it.next();
            System.out.println("当前元素是: " + a);
            if (a.length() < 6) {
                System.out.println(String.format("%s:字符串长度小于6，被删除了",a));
                it.remove();
            }
        }
        System.out.println(sites);

    }
}
