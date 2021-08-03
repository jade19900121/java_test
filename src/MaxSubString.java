import java.util.HashMap;

/**
 * @author fangjiulin
 * @date 2021/7/30 20:44
 */
public class MaxSubString {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        System.out.println("当前最长子串是:" + map);
        String sub  = "";
        for (Character ss: map.keySet()) {
            sub += ss;
        }
        System.out.println(sub);
        //System.out.println(sub.length());
        System.out.println();
        return max;
    }

    public static void main(String[] args) {
        int length = lengthOfLongestSubstring("abcabcdabcdefabcab");
        System.out.println(length);
    }

}

