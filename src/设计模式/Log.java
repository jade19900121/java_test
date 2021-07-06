package 设计模式;

import java.security.acl.LastOwnerException;

/**
 * @author fangjiulin
 * @version 1.0
 * @date 2021/7/6 0006 下午 6:48
 */
/*懒汉式*/
public class Log {
    private static HsLog logger = new HsLog();
    private Log() {
    }
    private static Log single = null;
    //静态工厂方法
    public static Log getInstance() {
        System.out.println("程序运行到这里了");
        if (single == null) {
            single = new Log();
        }
        return single;
    }

    public static void main(String[] args) {
//        Log a = Log.getInstance();
//        a.id = 100;
//        Log b = Log.getInstance();
//        if (a == b) {
//            System.out.println("创建的是同一个实例");
//            System.out.println(b.id);
//        }
//        System.out.println("hello");
        Log.logger.print_log("打印第一个日志");
        if (Log.logger == HsLog.singleton){
            System.out.println("两者相等");
        }
        else
        {
            System.out.println("两者不相等哦");
        }
        Log.logger.print_log("打印第二个日志");
    }
}
