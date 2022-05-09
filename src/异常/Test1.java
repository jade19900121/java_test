package 异常;

/**
 * @author fangjiulin
 * @date 2020/11/19 22:50
 */
public class Test1 {
    public static void main(String[] args) {
        try {
            process1();
            return;
        } catch (Exception e) {
            e.printStackTrace();
            return;
            //System.out.println(e.getMessage());
        }finally {
            return;
        }
    }

    static void process1() {
        process2();
    }

    static void process2() {
        Integer.parseInt(null); // 会抛出NumberFormatException
    }
}

