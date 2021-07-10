package 设计模式.工厂.静态;

import 设计模式.工厂.静态.Computer;

/**
 * @author fangjiulin
 * @date 2021/7/10 14:57
 */
public class WorkComputer implements Computer {

    @Override
    public void work() {
        System.out.println("这是一体机正在办公");
    }
}
