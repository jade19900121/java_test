package 数组;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author fangjiulin
 * @date 2020/11/14 20:30
 */
public class RunoobTest4 {
    public static void main(String[] args) {
        // 创建集合
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");

        // 获取迭代器
        Iterator<String> it = sites.iterator();

        // 输出集合中的所有元素
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
