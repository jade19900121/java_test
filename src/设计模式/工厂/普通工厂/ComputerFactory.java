package 设计模式.工厂.普通工厂;

/**
 * @author fangjiulin
 * @date 2021/7/10 14:58
 */
public class ComputerFactory {
    public Computer produce(String type) {
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
