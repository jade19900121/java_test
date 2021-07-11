package 设计模式.工厂.普通工厂;

/**
 * @author fangjiulin
 * @date 2021/7/11 16:11
 */
public class Test2 {
    public static void main(String[] args) {

        Computer computer1 = new PersonComputer();
        computer1.work();

        Computer computer2 = new WorkComputer();
        computer2.work();
    }
}
