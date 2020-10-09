package com.zy.test.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author: zy
 * @date: 2020/10/9 下午3:10
 * @description:
 */
public class Demo1 {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put("Java","1");
        map.put("PHP","2");
        map.put("GO","3");
        map.put("Python","4");
        map.put("signature","5");
        map.put("publickey","6");
        System.out.println(map);
        Map<String,String> treemap = new TreeMap<>(map);
        System.out.println(treemap);
    }
}
