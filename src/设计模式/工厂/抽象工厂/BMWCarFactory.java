package 设计模式.工厂.抽象工厂;

/**
 * @author fangjiulin
 * @date 2021/7/10 19:20
 */
public class BMWCarFactory implements CarFactory {
    // 生成迷你汽车的方法，返回MiniCar
    @Override
    public MiniCar produceMiniCar() {
        return new BMWMiniCar();
    }

    //生成SUV汽车的方法， 返回SUVCar
    @Override
    public SUVCar produceSUVCar() {
        return new BMWSUVCar();
    }
}
