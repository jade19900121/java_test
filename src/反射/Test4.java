package 反射;

import java.lang.reflect.Method;

/**
 * @author fangjiulin
 * @date 2022/5/15 22:44
 */
public class Test4 {
    public static void main(String[] args) throws Exception {
        //Person person = new Person();
        //Class cls = Person.class;
        //Class cls = person.getClass();
        //System.out.println(cls.getName());
        Class cls = Class.forName("反射.Person");
        Object obj = cls.newInstance();
        //System.out.println(obj.getClass());

        //类名称
        Method med = cls.getMethod("printHello3", String[].class);
        String[] name1 = new String[]{"张三", "李四"};
        //正确的
        String ss = (String) med.invoke(obj, new Object[]{name1});
        //错误的
        //String ss1 = (String) med.invoke(person, name1);

    }
}
