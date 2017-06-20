package com.xuanhuahu.java.basic;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by win7 on 2017/6/1.
 */
public class MapDemo {

    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<>();
        Integer a = 15;
        System.err.println(a.hashCode()^a.hashCode()>>>16);
        System.err.println(Integer.toBinaryString(16));
        System.err.println("啦啦".hashCode());
    }
}
