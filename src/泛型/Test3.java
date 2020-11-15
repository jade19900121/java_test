package 泛型;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author fangjiulin
 * @date 2020/11/15 12:55
 */
public class Test3 {
    public static void main(String[] args) {
//        List<Person> list1 = new ArrayList<>();
//        list1.add(new Person("fang",80));
//        list1.add(new Person("zhang",90));
//        list1.add(new Person("cai",100));
//        System.out.println(list1);

        Person[] ps = new Person[] {
                new Person("Bob", 61),
                new Person("Alice", 88),
                new Person("Lily", 75),
        };
        //System.out.println(ps);
//        for(Person i: ps){
//            System.out.println(i);
//        }
        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));

    }
}
