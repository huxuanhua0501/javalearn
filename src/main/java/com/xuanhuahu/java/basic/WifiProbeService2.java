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
///**
// * Created by win7 on 2017/5/15.
// */
//public class WifiProbeService2 {
//
//    public static void main(String[] args) throws IOException {
//
//        String oldpath = "D:\\mac\\data";
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
//      //  final CountDownLatch latch = new CountDownLatch(files.length);
//        Map<String, String> map = new HashMap<>();
//        map.put("结束了","kk");
//        BufferedReader bufr = null;
//        BufferedWriter bufw = null;
//        FileWriter fw = null;
//        fw = new FileWriter(file5 + File.separator+ "xxx");
//        bufw = new BufferedWriter(fw);
//        for (File file : files) {
//            FileReader fr = null;
//
//            try {
//                fr = new FileReader(file);
//                bufr = new BufferedReader(fr);
//
//
//                // 一行一行的寫。
//                String line = null;
//                String name = null;
//               int k = 1;
//                while ((line = bufr.readLine()) != null) {
//
//                    if(line.contains("wifiInfo")){
//                        k++;
//                        JSONObject json =null;
//                        try{
//                              json = JSONObject.parseObject(line);
//
//                        }catch (Exception e){
//                            System.err.println( k+"======");
//                            System.err.println( file.getName()+"    =============");
//                        }
//                       String strs =  json.get("wifiInfo").toString();
//                        List<HashMap> list  =  JSON.parseArray(strs,HashMap.class);
//                       for(int a = 0 ;a<list.size();a++){
//                               if (list.get(a).get("DType").equals("0"))
//                                   map.put(list.get(a).get("Mac").toString(), "111");
//
////                           }
////                           }
//                       }
//
//                    }
//
//                }
//
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
//        System.err.println(map.size());
//
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//
//    //    public static void main(String[] args) {
////        String str = "{\"GPS\":{\"lon\":116.44395053333334,\"lat\":39.906943,\"speed\":0.0,\"direction\":0.0},\"wifiInfo\":[]}";
////        JSONObject json = JSONObject.parseObject(str);
////        GPS gps = JSONObject.parseObject(json.get("GPS").toString(), GPS.class);
////        gps.setLon(gps.getLon().substring(0, 5));
////        gps.setLat(gps.getLat().substring(0, 4));
//////        Map<String, Object> map = new HashMap<String,Object>();
//////        map.put("GPS", gps);
//////        map.put("wifiInfo", json.get("wifiInfo"));
//////
//////        System.err.println(JSON.toJSONString(map));
////        JSONObject object = new JSONObject();
////        object.put("wifiInfo", json.get("wifiInfo"));
////        object.put("GPS",gps);
////
////        System.err.println(object);
////
////    }
////
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