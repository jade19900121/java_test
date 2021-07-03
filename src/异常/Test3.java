package 异常;

/**
 * @author fangjiulin
 * @date 2020/11/19 23:09
 */
public class Test3 {
    public static void main(String[] args) {

        try {
            String a = null;
            if (a == null) {
                throw new NullPointerException();
            }
            System.out.println("1111");
        }catch (Exception e){
            //System.out.println("222");
            e.printStackTrace();
        }
    }
}
