package 加密算法;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * @author fangjiulin
 * @date 2021/7/12 11:23
 */
public class HashTest {
    public static void main(String[] args) throws Exception{
        // 创建一个MessageDigest实例:
        MessageDigest md = MessageDigest.getInstance("MD5");
        // 反复调用update输入数据:
        md.update("Hello".getBytes("UTF-8"));
        md.update("World".getBytes("UTF-8"));
        byte[] result = md.digest(); // 16 bytes: 68e109f0f40ca72a15e05cc22786f8e6
        System.out.println(new BigInteger(1, result).toString(16));
    }
}
