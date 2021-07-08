package 拷贝;

/**
 * @author fangjiulin
 * @date 2021/7/8 22:49
 */
public class DeepCopy {
    //实现了深拷贝
    public static void main(String[] args) throws CloneNotSupportedException {
        Body body = new Body(new Head(new Face()));
        Body body1 = (Body) body.clone();
        System.out.println("body == body1 : " + (body == body1));
        System.out.println("body.head == body1.head : " + (body.head == body1.head));
        System.out.println("body.head.face == body1.head.face : " + (body.head.face == body1.head.face));
    }

}
