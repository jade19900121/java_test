package 设计模式.工厂.普通工厂;

/**
 * @author fangjiulin
 * @date 2021/7/10 14:56
 */
public class PersonComputer implements Computer {

    @Override
    public void work() {
        System.out.println("这是笔记本电脑，正在办公");
    }
}
