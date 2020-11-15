package 反射;

import 泛型.Person;
import 泛型.Student;

/**
 * @author fangjiulin
 * @date 2020/11/15 13:40
 */
public class Test1 {
    public static void main(String[] args) {
        Class cls1 = String.class;
        //System.out.println(cls1);

        String s = "Hello";
        Class cls2 = s.getClass();
        //System.out.println(cls2);

        boolean sameClass = cls1 == cls2; // true

        Person a = new Person("fang",100);
        Class cls3 = a.getClass();
        //System.out.println(cls3);


        Student b = new Student("fang",30);
        Class cls4 = b.getClass();
        System.out.println(cls4);
        System.out.println(cls4.getName());
        System.out.println(cls4.getMethods());
        System.out.println(cls4.getPackage());
        System.out.println(cls4.getInterfaces());




//        if (cls3 == cls4){
//            System.out.println("类型一致");
//        }else
//        {
//            System.out.println("类型不一致");
//        }

    }
}
