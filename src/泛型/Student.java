package 泛型;

/**
 * @author fangjiulin
 * @date 2020/11/15 13:45
 */
public class Student {
    private String name;
    private int age;
    public int number;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}
