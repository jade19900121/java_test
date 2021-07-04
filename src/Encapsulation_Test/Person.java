package Encapsulation_Test;

/**
 * @author fangjiulin
 * @date 2021/7/3 23:12
 */
public class Person {
    private String name = "hundsun";
    private int age = 25;
    private int id = 18854;
    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

//    public static void main(String[] args) {
//        Person a = new Person();
//        a.age = 10;
//        a.name = "fangjl";
//
//        System.out.println(a.age);
//        System.out.println(a.name);
//    }
}
