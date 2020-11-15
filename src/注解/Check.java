package 注解;

/**
 * @author fangjiulin
 * @date 2020/11/15 15:29
 */
public @interface Check {
    int min() default 0;
    int max() default 100;
    int value() default 50;
}
