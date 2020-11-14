package 枚举;

/**
 * @author fangjiulin
 * @date 2020/11/14 13:10
 */
public class Test4 {
    public static void main(String[] args) {
        Color myVar  = Color.RED;
        switch(myVar){
            case RED:
                System.out.println("红色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
            default:
                break;
        }
    }
}
