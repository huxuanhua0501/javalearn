//package com.xuanhuahu.java.basic;
//
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONObject;
//
//import java.io.*;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.*;
//
///**
// * Created by win7 on 2017/6/1.
// */
//public class MapDemo {
//
//    public static void main(String[] args) throws IOException {
//
//        String oldpath = "C:\\Users\\win7\\Desktop\\2017-08-21\\ss";
////
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
//        Map<String, String> map = new HashMap<>();
//        Map<String, String> map1 = new HashMap<>();
//        Set<String> set=new HashSet<String>();
////        map.put("结束了", "kk");
//        BufferedReader bufr = null;
//        BufferedWriter bufw = null;
//        FileWriter fw = null;
//        fw = new FileWriter(file5 + File.separator + "xxx");
//        bufw = new BufferedWriter(fw);
//        int b = 0 ;
//        for (File file : files) {
//            System.err.println(file.getPath());
////            System.err.println(file.length());
//            //  System.err.println(b++);
//            FileReader fr = null;
//
//            try {
//                fr = new FileReader(file);
//                bufr = new BufferedReader(fr);
//                // 一行一行的寫。
//                String line = null;
//                String name = null;
//                int k = 1;
//                while ((line = bufr.readLine()) != null) {
//                    if(line.contains("busInfo")) {
//                        JSONObject json = null;
//                        json = JSONObject.parseObject(line);
//                        String s = json.get("busInfo").toString();
//                        Map<String, String> maps = (Map) JSON.parse(s);
//                        map.put(file.getName().substring(0,file.getName().lastIndexOf("_Wi")), maps.get("line") +"-"+maps.get("busNo")+ "-" + maps.get("company"));
//
//                    }
//                    if (line.contains("wifiInfo")&&line.contains("}]}")) {
////                            line.last
//
//                        k++;
//                        JSONObject json = null;
//                        try {
//                            json = JSONObject.parseObject(line);
//
//                        } catch (Exception e) {
//                            //  System.err.println(file.getName() + "    =============");
//                        }
//                        String strs = null;
//                        try {
//                            strs = json.get("wifiInfo").toString();
//                        } catch (Exception e) {
//                            System.err.println(line.length());
//                            System.err.println(file.getName());
//                        }
//
//
//                        List<HashMap> list = JSON.parseArray(strs, HashMap.class);
//                        if(list.size()>0){
//                            for (int a = 0; a < list.size(); a++) {
//                                if (list.get(a).get("Mac").toString().contains("**")) {
//                                    map.remove(file.getName().substring(0,file.getName().lastIndexOf("_Wi")));
//                                    break;
//                                }else {
//                                    map1.put(file.getName().substring(0,file.getName().lastIndexOf("_Wi")), map.get(file.getName().substring(0,file.getName().lastIndexOf("_Wi"))));
////                                    set.add(file.getName().substring(0,file.getName().lastIndexOf("_Wi")));
//                                    break;
//                                }
//
//
////                           }
////                           }
//
//                            }
//                        }
//
//                    }
//                }
//
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
////        for (String str : set) {
////            System.out.println(str);
////        }
//        Iterator<Map.Entry<String, String>> it = map1.entrySet().iterator();
//        //  System.err.println(map.size());
//
//        while (it.hasNext()) {
////            String str = it.next().getKey();
//            String value = it.next().getValue();
////            if((str.indexOf("RoJwXuTRFM8Ix1SULLXceg..")!=-1)){
////
////
////            }else if((str.indexOf("oh9RwMDImm0R2WejdlCz1w..")!=-1)){
////
////            }else if((str.indexOf("2Bt9Y9xQeBXVgZz3g4-6ag..")!=-1)){
////
////             }else if((str.indexOf("iV6zPDpr4r29LfnE3wT8DA")!=-1)){
////
////        }else if((str.indexOf("FtSMXxzIGkICn5owq8BsAg..")!=-1)){
////
////        }
////      else if((str.indexOf("XByZwgQHu99c4qHfbpuzqQ")!=-1)){
////
////        }else{
//            System.err.println(value);
////            }
//        }
//
////        try {
////           // Thread.sleep(100);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//
//    }
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
//
//    private static class BusInfo {
//        private String line;
//        private String busNo;
//        private String company;
//        private String remark;
//        private String city;
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
