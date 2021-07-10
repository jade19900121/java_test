package 设计模式.工厂.抽象工厂;

/**
 * @author fangjiulin
 * @date 2021/7/10 19:17
 */
public class BMWMiniCar implements  MiniCar{
    @Override
    public void showInfo() {
        System.out.println("这是宝马Cooper迷你汽车");
    }
}
