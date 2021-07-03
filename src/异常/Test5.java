package 异常;

/**
 * @author fangjiulin
 * @date 2020/11/19 23:49
 */
public class Test5 {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.address.city.toLowerCase());
    }
}

class Person {
    String[] name = new String[2];
    Address address = new Address();
}

class Address {
    String city;
    String street;
    String zipcode;
}
