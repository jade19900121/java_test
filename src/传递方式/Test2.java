package 传递方式;

/**
 * @author fangjiulin
 * @version 1.0
 * @date 2021/7/9 0009 下午 12:04
 */
public class Test2 {
    public static void PersonCrossTest(Person person) {
        System.out.println("传入的person的name：" + person.getName());
        person.setName("我是张小龙");
        System.out.println("方法内重新赋值后的name：" + person.getName());
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("我是马化腾");
        p.setAge(45);
        PersonCrossTest(p);
        System.out.println("方法执行后的name：" + p.getName());
    }
}
