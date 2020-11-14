package 数组;

import java.util.LinkedList;

/**
 * @author fangjiulin
 * @date 2020/11/14 19:15
 */
public class RunoobTest1 {
    public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        sites.addFirst("fangjiulin1");
        sites.addLast("fangjiulin2");
        //System.out.println(sites);
        for (String i: sites){
            System.out.println(i);
        }
    }
}
