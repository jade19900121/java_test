package 泛型;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author fangjiulin
 * @date 2020/11/14 21:07
 */
public class Tets1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        System.out.println(list);
        //获取元素
        String first = list.get(0);
        System.out.println(first);
        String second = list.get(1);
        System.out.println(second);

        List<Number> list1 = new ArrayList<Number>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(22);
        list2.add(33);
        System.out.println(list2);
    }
}
