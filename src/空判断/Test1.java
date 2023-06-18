package 空判断;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author fangjiulin
 * @date 2022/5/28 13:33
 */
public class Test1 {
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<>(8);
//        a1 = null;
//        if (a1.size() == 0 || a1 == null) {
//            System.out.println("此时会有异常");
//        }
//        if (a1 == null || a1.size() == 0) {
//            System.out.println("此时可以正常判断");
//        }

        //方法1
//        if (a1 == null) {
//            System.out.println("a1是null");
//        } else if (a1.isEmpty()) {
//            System.out.println("a1是空的,但不是null");
//        } else {
//            System.out.println("a1里面有值");
//        }

    }
}
