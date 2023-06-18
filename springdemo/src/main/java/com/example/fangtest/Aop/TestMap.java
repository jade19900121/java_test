package com.example.fangtest.Aop;

import org.springframework.util.CollectionUtils;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author fangjiulin
 * @date 2022/5/28 15:25
 */
public class TestMap {
    public static void main(String[] args) {
//        Map<String, Object> map1 = new HashMap<>(16);
//        System.out.println(CollectionUtils.isEmpty(map1));
//        map1 = null;
//        System.out.println(CollectionUtils.isEmpty(map1));

        String[] array1 = new String[]{"1", "2"};
        List<String> list1 = (List<String>) CollectionUtils.arrayToList(array1);
        System.out.println(list1);
        System.out.println(list1.indexOf("0"));
    }
}
