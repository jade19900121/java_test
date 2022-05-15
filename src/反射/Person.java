package 反射;

/**
 * @author fangjiulin
 * @date 2022/5/15 15:35
 */
public class Person {


    public String printHello1(String name) {
        System.out.println("Hello my name is: " + name);
        String str = "Hello my name is: " + name;
        return str;
    }

    public String printHello2(int name) {
        System.out.println("Hello my name is" + name);
        String str = "Hello my name is" + name;
        return str;
    }

    public String printHello3(String[] name) {
        StringBuilder sb = new StringBuilder();
        for (String str : name) {
            sb.append("当前的name是:").append(str);
        }
        System.out.println("当前的sb是" + sb.toString());
        return sb.toString();
    }

    private String printHello4(String[] name) {
        StringBuilder sb = new StringBuilder();
        for (String str : name) {
            sb.append("当前的name是:").append(name);
        }
        return sb.toString();
    }


}
