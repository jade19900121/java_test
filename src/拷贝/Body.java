package 拷贝;

/**
 * @author fangjiulin
 * @date 2021/7/8 23:21
 */
public class Body implements Cloneable{
    public Head head;

    public Body() {}

    public Body(Head head) {this.head = head;}

    @Override
    protected Object clone() throws CloneNotSupportedException {
       // return super.clone();
        Body body1 = (Body) super.clone();
        body1.head = (Head) head.clone();
        return  body1;
    }
}
