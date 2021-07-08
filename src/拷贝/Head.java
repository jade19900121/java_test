package 拷贝;

/**
 * @author fangjiulin
 * @date 2021/7/8 23:22
 */
public class Head implements Cloneable{
    public  Face face;
    public Head() {}
    public Head(Face face){this.face = face;}
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        Head newHead = (Head) super.clone();
        newHead.face = (Face) face.clone();
        return newHead;
    }
}
