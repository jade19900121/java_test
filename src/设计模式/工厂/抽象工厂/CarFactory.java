package 设计模式.工厂.抽象工厂;

/**
 * @author fangjiulin
 * @date 2021/7/10 19:19
 */
public interface CarFactory {
    //生成不同型号的汽车 ，两条产品线
    public MiniCar produceMiniCar();

    public SUVCar produceSUVCar();
}
