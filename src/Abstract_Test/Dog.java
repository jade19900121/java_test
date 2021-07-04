package Abstract_Test;

import javax.jws.soap.SOAPBinding;

/**
 * @author fangjiulin
 * @date 2021/7/3 22:41
 */
public class Dog extends Animal{

    @Override
    public void eat() {
        //super.eat();
        System.out.println("我是狗，我吃骨头");
    }

}
