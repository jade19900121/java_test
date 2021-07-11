package 枚举;

/**
 * @author fangjiulin
 * @date 2021/7/11 21:15
 */

enum Week {
    SUN, MON, TUE, WED, THU, FRI, SAT;
}

public class WeekdayTest1 {

    public static void main(String[] args) {
        Week day = Week.THU;
        if (day == Week.SAT || day == Week.SUN) {
            System.out.println("Work at home!");
        } else {
            System.out.println("Work at office!");
        }

        //int day1 = Weekday.MON; 报错
        if (day.equals(Weekday.SUN)) {
            System.out.println("Work at home!");
        } else {
            System.out.println(day);
            System.out.println("Work at office!");
        }
    }
}
