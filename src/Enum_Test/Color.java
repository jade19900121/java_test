package Enum_Test;

/**
 * @author fangjiulin
 * @date 2020/11/14 12:58
 */
public enum Color {
    RED, GREEN, BLUE;
    // 构造函数
    private Color()
    {
        System.out.println("Constructor called for : " + this.toString());
    }

    public void colorInfo()
    {
        System.out.println("Universal Color");
    }
}

