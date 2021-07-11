package 设计模式.工厂.普通工厂;

/**
 * @author fangjiulin
 * @date 2021/7/10 15:23
 */
public class Test1 {
    public static void main(String[] args) {
        // 通过工厂类创建对象
        ComputerFactory factory = new ComputerFactory();
        Computer computer1 = factory.produce("workComputer");
        computer1.work();
        Computer computer2 = factory.produce("personComputer");
        computer2.work();

        Computer computer3 = ComputerFactory2.produce("workComputer");
        computer3.work();

    }
}
