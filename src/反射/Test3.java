package 反射;

import java.lang.reflect.Method;

/**
 * @author fangjiulin
 * @date 2022/5/15 15:38
 */
public class Test3 {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        //person.printHello("fangjiulin");
        Class cls = Person.class;
        //类名称
//        System.out.println(cls.getName());
//        System.out.println(cls.getMethod("printHello1", String.class));
//        //包名
//        System.out.println(cls.getPackage());
//        System.out.println(cls.getMethod("printHello2", int.class));
//
//        System.out.println(cls.getMethod("printHello3", String[].class));
//        System.out.println(String[].class.getName());
//
//        System.out.println(cls.getDeclaredMethod("printHello4", String[].class));
//
        Method med = cls.getMethod("printHello3", String[].class);
        // System.out.println(med.getParameterTypes());
        String[] name1 = new String[]{"张三", "李四"};
        //正确的
        String ss = (String) med.invoke(person, new Object[]{name1});
        //错误的
        String ss1 = (String) med.invoke(person, name1);

    }

}
