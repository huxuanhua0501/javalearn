package com.xuanhuahu.java.basic;

/**
 * Created by win7 on 2017/6/5.
 */
public class StringBUilderDemo {
    public static void main(String[] args) {
        StringBuilder builder = null;
        String t = "abc";
        byte[] bytes = t.getBytes();
        System.err.println(t.hashCode());
        for(int i = 0 ;i<bytes.length ;i++){
            System.err.println(bytes[i]);

        }
    }
}
