package 数组;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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
        for (int i = 0;i<sites.size();i++){
            System.out.println(sites.get(i));
        }
    }
}
