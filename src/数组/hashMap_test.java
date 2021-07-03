package 数组;

import javax.swing.*;
import java.util.HashMap;

/**
 * @author fangjiulin
 * @date 2021/7/2 23:00
 */
public class hashMap_test {
    public static void main(String[] args) {
        // 创建 HashMap 对象 Sites
        HashMap<Integer, String> Sites1 = new HashMap<Integer, String>();
        // 添加键值对
        Sites1.put(1, "Google");
        Sites1.put(2, "Runoob");
        Sites1.put(3, "Taobao");
        Sites1.put(4, "Zhihu");
        System.out.println(Sites1);


        //key为string类型
        HashMap<String, String> Sites2 = new HashMap<String, String>();
        // 添加键值对
        Sites2.put("zhangsan", "Google");
        Sites2.put("lisi", "Runoob");
        Sites2.put("wangwu", "Taobao");
        System.out.println(Sites2);
        System.out.println(Sites2.get("lisi"));

        //遍历
        for (String i : Sites2.keySet()) {
            System.out.println("key: " + i + " value: " + Sites2.get(i));
        }
        System.out.println(Sites2.values());
        for(String value: Sites2.values()) {
            // 输出每一个value
            System.out.print(value + ", ");
        }
    }
}
