package 数组;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author fangjiulin
 * @date 2020/11/14 19:01
 */
public class ArrayList_test {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Runoob");
        sites.add("Google");
        sites.add("Taobao");
        sites.add("Weibo");
        Collections.sort(sites);
        System.out.println(sites);
        //遍历
        for (String i : sites) {
            System.out.println(i);
        }
        System.out.println("\n");
        //遍历1111
        for (int i = 0; i < sites.size(); i++) {
            System.out.println(sites.get(i));
        }
        //向上转型，ArrayList<T>实现了List<T>接口，它可以向上转型为List<T>
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        String a = list.get(0);
        System.out.println("a的值:" + a);
        System.out.println(String.format("a的值:%s", a));
        //在list中插入一个值
        list.add(1,"fang");
        System.out.println("list的值:" + list);
        //在list中删除一个元素
        list.remove(2);
        System.out.println("list的值:" + list);

    }
}
