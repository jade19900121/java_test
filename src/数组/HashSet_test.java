package 数组;

import java.util.HashSet;

/**
 * @author fangjiulin
 * @date 2021/7/2 22:38
 */
public class HashSet_test {
    public static void main(String[] args) {
        HashSet<String> sites = new HashSet<String>();
        sites.add("111");
        sites.add("222");
        sites.add("333");
        sites.add("444");
        sites.add("111");  // 重复的元素不会被添加
        System.out.println(sites);
        //删除一个元素
        sites.remove("444");
        System.out.println(sites);
        //清空
        sites.clear();
        System.out.println(sites);
        //重新添加元素，计算set的大小
        sites.add("111");
        sites.add("222");
        sites.add("333");
        sites.add("444");
        System.out.println(String.format("现在列表的大小是:%s", sites.size()));
        //采用for进行迭代输出
        for (String i : sites) {
            System.out.println(i);
        }
        System.out.println("\n");
        //遍历
        for (int i = 0; i < sites.size();i++){
            System.out.println();
        }
    }
}
