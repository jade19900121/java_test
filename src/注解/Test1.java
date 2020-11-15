package 注解;

/**
 * @author fangjiulin
 * @date 2020/11/15 15:14
 */
public class Test1 {
    @Check(min=0, max=100, value=55)
    public int n;

    @Check(value=99)
    public int p;

    @Check(99) // @Check(value=99)
    public int x;

    @Check
    public int y;

    public static void main(String[] args) {
        Test1 a = new Test1();
        a.n = -1;
        System.out.println(a.n);
    }
}
