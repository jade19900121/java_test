package 数组;

import java.util.HashMap;

/**
 * @author fangjiulin
 * @date 2020/11/14 19:36
 */
public class RunoobTest3 {
    public static void main(String[] args) {
        HashMap<Integer, String> sites = new HashMap<Integer, String>();
        sites.put(1,"fang1");
        sites.put(2,"fang2");
        sites.put(3,"fang3");
        sites.put(4,"fang4");
        System.out.println(sites);
        System.out.println(sites.get(3));
        //sites.clear();
        //System.out.println(sites);
        for (Integer i : sites.keySet()) {
            System.out.println("key: " + i + " value: " + sites.get(i));
        }

    }

}
