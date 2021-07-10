package 设计模式.工厂.抽象工厂;

/**
 * @author fangjiulin
 * @date 2021/7/10 19:18
 */
public class AudiSUVCar implements  SUVCar{
    @Override
    public void showInfo() {
        System.out.println("这是一辆 奥迪SUV汽车");
    }
}
