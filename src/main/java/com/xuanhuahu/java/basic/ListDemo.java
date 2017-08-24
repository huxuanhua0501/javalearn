//package com.xuanhuahu.java.basic;
//
//import java.io.UnsupportedEncodingException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.concurrent.ConcurrentHashMap;
//
///**
// * Created by win7 on 2017/6/9.
// */
//public class ListDemo {
//    public static void main(String[] args) throws UnsupportedEncodingException {
//        List<String> list = new ArrayList<String>();
////        list.add("1");
////        list.add("2");
////        list.add("3");
////        list.add("4");
////        list.add("5");
////        list.set(4,"沃日");
////        System.err.println(list.get(4));
////        ConcurrentHashMap n =null;
////                HashMap map = null;
////        System.err.println(475000*5);
//
//        String str =" \\xe6\\xb7\\xb1\\xe5\\x9c\\xb3";
//        try {            String sql = new String(str.getBytes("ISO-8859-1"), "utf-8");
//            System.err.println(sql);
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//        String s = "中国";
//        System.err.println(s.getBytes("gbk"));
//    }
//
//
//    public  static  String convertCharset(String s) {
//        if (s != null) {
//            try {
//                int length = s.length();
//                byte[] buffer = new byte[length];
//                // 0x81 to Unicode 0x0081, 0x8d to 0x008d, 0x8f to 0x008f, 0x90
//                // to 0x0090, and 0x9d to 0x009d.
//                for (int i = 0; i < length; ++i) {
//                    char c = s.charAt(i);
//                    if (c == 0x0081) {
//                        buffer[i] = (byte) 0x81;
//                    } else if (c == 0x008d) {
//                        buffer[i] = (byte) 0x8d;
//                    } else if (c == 0x008f) {
//                        buffer[i] = (byte) 0x8f;
//                    } else if (c == 0x0090) {
//                        buffer[i] = (byte) 0x90;
//                    } else if (c == 0x009d) {
//                        buffer[i] = (byte) 0x9d;
//                    } else {
//                        buffer[i] = Character.toString(c).getBytes("CP1252")[0];
//                    }
//                }
//                String result = new String(buffer, "UTF-8");
//                return result;
//            } catch (UnsupportedEncodingException e) {
//                e.printStackTrace();
//            }
//        }
//        return null;
//    }
//}
