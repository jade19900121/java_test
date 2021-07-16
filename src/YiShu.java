import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;

/**
 * @author fangjiulin
 * @date 2021/7/15 20:50
 */
public class YiShu {

    public static ArrayList<Integer> getResult(int[] myList){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i < myList.length - 1; i++) {
            //System.out.println(i);
            if (myList[i] != myList[i - 1] && myList[i] != myList[i + 1]) {
                result.add(myList[i]);
                int size = result.size();
                if (size > 1) {
                    System.out.println("存在两个不同的异数，报错");
                    return null;
                }
            }
        }
        if (result.size() == 1){
            System.out.println("最后的结果是:" + result.get(0));
            return result;
        }
        else
        {
            System.out.println("该数据没有异数");
            return null;
        }
    }

    public static void main(String[] args) {
        int[] myList1 = {1, 1, 1, 2, 2, 2, 3, 4, 4, 5, 5};
        getResult(myList1);

        int[] myList2 = {2,2,3,3,4,4,5,5};
        getResult(myList2);

    }
}
