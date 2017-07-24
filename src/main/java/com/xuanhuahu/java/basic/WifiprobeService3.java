package com.xuanhuahu.java.basic;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class WifiprobeService3 {

    public static void main(String[] args) throws IOException {

//        while (true) {
        String oldpath = "D:\\mac\\data";
        String newpath = "D:\\macs\\data";
        // System.err.println(path);
        File file2 = new File(oldpath);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        File file5 = new File(newpath);
        if (!file5.exists()) {
            file5.mkdirs();
        }
        // 目录下所有的文件
        File[] files = file2.listFiles();
        String url = null;
        int i = 1;
        //  final CountDownLatch latch = new CountDownLatch(files.length);
        Map<String, String> map = new HashMap<>();
        map.put("结束了","kk");
        BufferedReader bufr = null;
        BufferedWriter bufw = null;
        FileWriter fw = null;
        fw = new FileWriter(file5 + File.separator+ "xxx");
        bufw = new BufferedWriter(fw);
        for (File file : files) {
            //  latch.countDown();
//            System.err.println(i+++" =="+file.getName());
            FileReader fr = null;
//            FileWriter fw = null;

            try {
                fr = new FileReader(file);
//                fw = new FileWriter(file5 + File.separator + file.getName());
                bufr = new BufferedReader(fr);
//                bufw = new BufferedWriter(fw);


                // 一行一行的寫。
                String line = null;
                String name = null;
                int k = 1;
                while ((line = bufr.readLine()) != null) {

                    if(line.contains("wifiInfo")){
                        k++;
                        JSONObject json =null;
                        try{
                            json = JSONObject.parseObject(line);

                        }catch (Exception e){
                            System.err.println( k+"======");
                            System.err.println( file.getName()+"    =============");
                        }
                        String strs =  json.get("wifiInfo").toString();
                        List<HashMap> list  =  JSON.parseArray(strs,HashMap.class);
                        for(int a = 0 ;a<list.size();a++){
//                           if(list.get(a).get("Mac").toString().indexOf("*") < 0) {
                            // System.out.println(list.get(a).get("Mac").toString());
                            if (list.get(a).get("DType").equals("0"))
                                map.put(list.get(a).get("Mac").toString(), "111");

//                           }
//                           }
                        }

//                        BusInfo busInfo = JSONObject.parseObject(json.get("Mac").toString(), BusInfo.class);
//                        name = busInfo.getBusNo();
                    }
//                    if (line.contains("GPS")) {
//                        JSONObject json = JSONObject.parseObject(line);
//                        GPS gps = JSONObject.parseObject(json.get("GPS").toString(), GPS.class);
//                        gps.setLon(gps.getLon().substring(0, 5));
//                        gps.setLat(gps.getLat().substring(0, 4));
//                        JSONObject object = new JSONObject();
//                        object.put("GPS", gps);
//                        bufw.write(line.replace(json.get("GPS").toString(), JSON.toJSONString(object.get("GPS"))));
//                    } else {

//                        bufw.write(set.toString());
//                    }
//                    bufw.newLine();
//                    bufw.flush();
                }

//                bufr.close();
//                //   file.delete();
//                bufw.close();
//                Thread.sleep(123);
//                File f=new File(file5 + File.separator + file.getName());
//                System.err.println(file.getName().replace(file.getName().substring(0,file.getName().indexOf("_WiFiProbe")),name));
//                File mm=new File(file5+File.separator+file.getName().replace(file.getName().substring(0,file.getName().indexOf("_WiFiProbe")),name));
//                if(f.renameTo(mm))
//                {
//                    System.out.println("修改成功!");
//                }
//                else
//                {
//                    System.out.println("修改失败");
//                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
//        bufw.write(set.toString());
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        System.err.println(map.size());
//         while (it.hasNext()) {
//             System.out.println(it.next().getKey() + ",");
//         }
//        try {
//          //  latch.await();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    //    public static void main(String[] args) {
//        String str = "{\"GPS\":{\"lon\":116.44395053333334,\"lat\":39.906943,\"speed\":0.0,\"direction\":0.0},\"wifiInfo\":[]}";
//        JSONObject json = JSONObject.parseObject(str);
//        GPS gps = JSONObject.parseObject(json.get("GPS").toString(), GPS.class);
//        gps.setLon(gps.getLon().substring(0, 5));
//        gps.setLat(gps.getLat().substring(0, 4));
////        Map<String, Object> map = new HashMap<String,Object>();
////        map.put("GPS", gps);
////        map.put("wifiInfo", json.get("wifiInfo"));
////
////        System.err.println(JSON.toJSONString(map));
//        JSONObject object = new JSONObject();
//        object.put("wifiInfo", json.get("wifiInfo"));
//        object.put("GPS",gps);
//
//        System.err.println(object);
//
//    }
//
    private static class GPS {
        private String lon;
        private String lat;
        private String speed;

        public String getLon() {
            return lon;
        }

        public void setLon(String lon) {
            this.lon = lon;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getSpeed() {
            return speed;
        }

        public void setSpeed(String speed) {
            this.speed = speed;
        }
    }
    private  static  class  BusInfo{
        private String line;
        private String busNo;
        private  String company;
        private String remark;
        private  String city;

        public String getLine() {
            return line;
        }

        public void setLine(String line) {
            this.line = line;
        }

        public String getBusNo() {
            return busNo;
        }

        public void setBusNo(String busNo) {
            this.busNo = busNo;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }
}
