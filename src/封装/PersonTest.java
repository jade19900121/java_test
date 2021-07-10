package 封装;

/**
 * @author fangjiulin
 * @date 2021/7/3 23:14
 */
public class PersonTest {
    public static void main(String[] args) {
//        Person a = new Person();
//        a.name = "zhangsan";
//        a.age = 30;
//        System.out.println(a.age);
//        System.out.println(a.name);

        Person a = new Person();
        System.out.println(a);
        a.setAge(30);
        a.setName("fangjl");
        System.out.println(a.getAge());
        System.out.println(a.getName());
        System.out.println(a.getId());
    }
}
