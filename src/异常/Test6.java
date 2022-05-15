package 异常;

import com.sun.deploy.security.BadCertificateDialog;

/**
 * @author fangjiulin
 * @date 2022/5/9 23:39
 */
public class Test6 {
    public static void main(String[] args) {

        String test = add();
        System.out.println("test的值是" + test);
    }

    public static String add() {
        try {
            System.out.println("开始来到这里");
            Integer a = null;
            if (a == 0 ) {
                System.out.println("a等于0");
            }
            return "aaa";
        } catch (Exception e) {
            System.out.println("异常信息" + e.getMessage());
            return "bbb";
        } finally {
            System.out.println("来到这里了");
            //return "ccc";
        }
    }
}
