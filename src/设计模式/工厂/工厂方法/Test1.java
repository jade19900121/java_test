package 设计模式.工厂.工厂方法;

/**
 * @author fangjiulin
 * @date 2021/7/10 19:00
 */
public class Test1 {
    public static void main(String[] args) {
        //先创建 汽车工厂
        CarFactory bmwFactory = new BMWCarFactory();
        // 这个工厂生产的汽车就是 宝马
        Car bmw = bmwFactory.produce();
        bmw.showInfo();

        CarFactory aidiFactory = new AudiCarFactory();
        Car audi = aidiFactory.produce();
        audi.showInfo();
    }
}
