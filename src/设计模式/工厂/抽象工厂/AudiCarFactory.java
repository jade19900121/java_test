package 设计模式.工厂.抽象工厂;

/**
 * @author fangjiulin
 * @date 2021/7/10 19:19
 */
public class AudiCarFactory implements  CarFactory{
    @Override
    public MiniCar produceMiniCar() {
        return new AudiMiniCar();
    }

    @Override
    public SUVCar produceSUVCar() {
        return new AudiSUVCar();
    }
}
