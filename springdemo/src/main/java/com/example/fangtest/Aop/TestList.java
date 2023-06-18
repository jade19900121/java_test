package com.example.fangtest.Aop;
import org.apache.commons.lang.StringUtils;
import org.springframework.expression.spel.ast.NullLiteral;
import org.springframework.util.ObjectUtils;
import java.util.ArrayList;
import java.util.List;

/**
 * @author fangjiulin
 * @date 2022/5/28 14:10
 */
public class TestList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(16);
        //list1 = null;
//        if(CollectionUtils.isEmpty(list1)){
//            System.out.println("当前的list1是空");
//            if (list1  == null){
//                System.out.println("是null");
//            }else{
//                System.out.println("不是null");
//            }
//        }

//        if (ObjectUtils.isEmpty(list1)){
//            System.out.println("进来了");
//        }

//        System.out.println(StringUtils.isBlank(" "));
//        System.out.println(StringUtils.isBlank(""));
//        System.out.println(StringUtils.isBlank(null));
//        System.out.println(StringUtils.isEmpty(" "));
//        System.out.println(StringUtils.isEmpty(""));
//        System.out.println(StringUtils.isEmpty(null));

        System.out.println(StringUtils.equals(null, null));
        System.out.println("".equals(""));
        System.out.println(StringUtils.upperCase("abcDefg"));
        System.out.println(StringUtils.lowerCase("ABCdEFG"));
    }
}
