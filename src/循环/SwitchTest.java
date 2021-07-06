package 循环;

/**
 * @author fangjiulin
 * @version 1.0
 * @date 2021/7/6 0006 下午 4:56
 */
public class SwitchTest {
    public static void main(String[] args) {
        char grade = 'B';
        switch (grade){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
                //break;
            case 'C':
                System.out.println("及格");
                break;
            case 'D':
                System.out.println("不及格");
                break;
            default:
                System.out.println("未知等级");
        }
    }
}
