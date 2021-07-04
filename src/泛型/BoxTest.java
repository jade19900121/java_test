package 泛型;

/**
 * @author fangjiulin
 * @date 2021/7/4 20:33
 */
public class BoxTest<T> {
    private T t;
    //private E t1;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

//    public E getT1() {
//        return t1;
//    }
//
//    public void setT1(E t1) {
//        this.t1 = t1;
//    }

    public static void main(String[] args) {

        BoxTest<Integer> integerBox = new BoxTest<Integer>();
        BoxTest<String> stringBox = new BoxTest<String>();

        integerBox.add(new Integer(10));
        //integerBox.setT1("fangjl");
        stringBox.add(new String("菜鸟教程"));
        //stringBox.setT1(100);

        System.out.printf("整型值为 :%d\n", integerBox.get());
        //System.out.printf("字符串为 :%s\n", integerBox.getT1());

        System.out.printf("字符串为 :%s\n", stringBox.get());
        //System.out.printf("整型值为 :%d\n", stringBox.getT1());
    }


}
