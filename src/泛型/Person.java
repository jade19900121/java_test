package 泛型;

import java.util.concurrent.Callable;

/**
 * @author fangjiulin
 * @date 2020/11/15 12:54
 */
public class Person implements Comparable<Person> {
    String name;
    int score;
    public Person(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String toString() {
        return this.name + "," + this.score;
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);

    }
}
