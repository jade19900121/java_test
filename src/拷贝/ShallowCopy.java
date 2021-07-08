package 拷贝;

/**
 * @author fangjiulin
 * @date 2021/7/7 22:38
 */
public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {

        //引用的拷贝
        Person a = new Person(18854, "fangjl");
        Person b = a;
        System.out.println(a);
        System.out.println(b);
        //a对象和b对象是相同的
//        System.out.println(System.identityHashCode(a));
//        System.out.println(System.identityHashCode(b));

//        System.out.println(b.getId());
//        System.out.println(b.getName());

        String ss = new String("a");
        int code1 = System.identityHashCode(ss);
        //System.out.println(code1);

        String bb = ss;
        int code2 = System.identityHashCode(bb);
        //System.out.println(code2);

        //将b的变量改变，查看a的对象变量会不会变化
        b.setId(18855);
        System.out.println(a.getId());

        Person p1 = new Person(100, "张三");
        Person p2 = (Person) p1.clone();
        System.out.println(p1);
        System.out.println(p2);
        //p1.setName("李四");
        System.out.println(p1.getName());
        System.out.println("pName：" + p1.getName().hashCode());
        System.out.println(p2.getName());
        System.out.println("pName：" + p2.getName().hashCode());

        if (p1.getName() == p2.getName()) {
            System.out.println("二者相同");
        } else {
            System.out.println("二者不同");
        }
    }
}
