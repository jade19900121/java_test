package 数组;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author fangjiulin
 * @date 2020/11/14 19:01
 */
public class RunoobTest {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Runoob");
        sites.add("Google");
        sites.add("Taobao");
        sites.add("Weibo");
        Collections.sort(sites);
        System.out.println(sites);
//        for (String i : sites) {
//            System.out.println(i);
//        }
    }
}
