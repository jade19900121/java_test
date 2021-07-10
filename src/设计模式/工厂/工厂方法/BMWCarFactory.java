package 设计模式.工厂.工厂方法;

/**
 * @author fangjiulin
 * @date 2021/7/10 18:58
 */
public class BMWCarFactory implements CarFactory{
    @Override
    public Car produce() {
        return new BMWCar();
    }
}
