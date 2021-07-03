package Interface_test;

/**
 * @author fangjiulin
 * @date 2020/11/14 14:30
 */
public interface Animal {
    public void eat();

    public default void sleep() {
        System.out.println("I am Animal,I can sleep");
    }
}
