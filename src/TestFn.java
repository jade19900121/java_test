/**
 * @author fangjiulin
 * @date 2021/7/19 21:00
 */
public class TestFn {

    public static int fnSum(int n) {
        String s1 = String.valueOf(n);
        //System.out.println(s1);
        int sum = 0;
        for (int i = 0; i < s1.length(); i++) {
            int x = Integer.parseInt(s1.substring(i, i + 1));
            sum += x * x;
        }
        //System.out.println("值为:" + sum);
        return sum;
    }

    public static int getResult(int[] myList) {
        int number = 0;
        int k = myList[0];
        int a = myList[1];
        int b = myList[2];

        for (int i = a; i < b; i++) {
            if (k * fnSum(i) == i) {
                //System.out.println("i的值:" + i);
                number += 1;
            }
        }
        System.out.println("最终的结果是:" + number);
        return number;
    }

    public static void main(String[] args) {
        int[] list1 = {51, 5000, 10000};
        //fnSum(510);
        getResult(list1);
    }

}
