package 枚举;

/**
 * @author fangjiulin
 * @date 2020/11/14 13:00
 */
public class Test2 {
    enum Color1{
        RED,GREEN,BLUE;
        private Color1()
        {
            System.out.println("Constructor called for : " + this.toString());
        }
    }

    public static void main(String[] args) {
        Color1 a = Color1.BLUE;
        System.out.println(a);
    }
}
