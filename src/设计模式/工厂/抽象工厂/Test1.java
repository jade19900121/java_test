package 设计模式.工厂.抽象工厂;

/**
 * @author fangjiulin
 * @date 2021/7/10 19:20
 */
public class Test1 {
    public static void main(String[] args) {
        //创建宝马迷你汽车  找工厂
        CarFactory factory = new BMWCarFactory();
        MiniCar car = factory.produceMiniCar();
        car.showInfo();

        SUVCar car1 = factory.produceSUVCar();
        car1.showInfo();
    }
}
