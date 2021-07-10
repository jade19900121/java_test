package 接口;

/**
 * @author fangjiulin
 * @date 2020/11/14 14:30
 */
public interface Animal {
    //public String name = "fangjl";
    public final  static int id = 18854;
    public void eat();
    public default void sleep() {
        System.out.println("I am Animal,I can sleep");
    }
}
