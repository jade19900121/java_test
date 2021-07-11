package 枚举;

/**
 * @author fangjiulin
 * @date 2021/7/11 21:09
 */
public class WeekdayTest {
    public static void main(String[] args) {
        int day = Weekday.FRI;
        if (day == 1 || day == 5) {
            System.out.println("work at home");
        } else {
            System.out.println("work at company");
        }
    }
}
