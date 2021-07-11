package 设计模式.工厂.普通工厂;

/**
 * @author fangjiulin
 * @date 2021/7/10 15:24
 */
public class ComputerFactory2 {
    public static Computer produce(String type) {
        Computer computer = null;
        if (type == "personComputer") {
            computer = new PersonComputer();
        } else if (type == "workComputer") {
            computer = new WorkComputer();
        } else {
            System.out.println("不能生产");
        }
        return computer;
    }
}
