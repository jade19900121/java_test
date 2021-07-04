package 序列化;

/**
 * @author fangjiulin
 * @date 2021/7/4 21:14
 */
public class Employee implements java.io.Serializable{
    public String name;
    public String address;
    public transient int SSN;
    public int number;
    public void mailCheck()
    {
        System.out.println("Mailing a check to " + name
                + " " + address);
    }
}
