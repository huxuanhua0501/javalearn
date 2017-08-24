//package com.xuanhuahu.java.basic;
//
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONObject;
//
//import java.io.*;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
//
//public class WifiprobeService4 {
//
//    public static void main(String[] args) throws IOException {
//
////        while (true) {
//        String oldpath = "E:\\wif探针重要\\724\\cc\\datas";
//        String newpath = "D:\\macs\\data";
//        // System.err.println(path);
//        File file2 = new File(oldpath);
//        if (!file2.exists()) {
//            file2.mkdirs();
//        }
//        File file5 = new File(newpath);
//        if (!file5.exists()) {
//            file5.mkdirs();
//        }
//        // 目录下所有的文件
//        File[] files = file2.listFiles();
//        String url = null;
//        int i = 1;
//        //  final CountDownLatch latch = new CountDownLatch(files.length);
//        Map<String, String> map = new HashMap<>();
//        map.put("结束了","kk");
//        BufferedReader bufr = null;
//        BufferedWriter bufw = null;
//        FileWriter fw = null;
//        fw = new FileWriter(file5 + File.separator+ "xxx");
//        bufw = new BufferedWriter(fw);
//         int avg = files.length;
//         long sum = 0;
////        System.err.println(avg);
//        for(File file:files){
//            sum= sum+file.length()/1024;
//        }
//        System.err.println(sum);
//        System.err.println(avg);
//        System.err.println(sum/avg);
//      //  System.err.println(sum/avg);
//    }
//
//
//
//    private static class GPS {
//        private String lon;
//        private String lat;
//        private String speed;
//
//        public String getLon() {
//            return lon;
//        }
//
//        public void setLon(String lon) {
//            this.lon = lon;
//        }
//
//        public String getLat() {
//            return lat;
//        }
//
//        public void setLat(String lat) {
//            this.lat = lat;
//        }
//
//        public String getSpeed() {
//            return speed;
//        }
//
//        public void setSpeed(String speed) {
//            this.speed = speed;
//        }
//    }
//    private  static  class  BusInfo{
//        private String line;
//        private String busNo;
//        private  String company;
//        private String remark;
//        private  String city;
//
//        public String getLine() {
//            return line;
//        }
//
//        public void setLine(String line) {
//            this.line = line;
//        }
//
//        public String getBusNo() {
//            return busNo;
//        }
//
//        public void setBusNo(String busNo) {
//            this.busNo = busNo;
//        }
//
//        public String getCompany() {
//            return company;
//        }
//
//        public void setCompany(String company) {
//            this.company = company;
//        }
//
//        public String getRemark() {
//            return remark;
//        }
//
//        public void setRemark(String remark) {
//            this.remark = remark;
//        }
//
//        public String getCity() {
//            return city;
//        }
//
//        public void setCity(String city) {
//            this.city = city;
//        }
//    }
//}
