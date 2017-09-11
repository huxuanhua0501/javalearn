package com.xuanhuahu.java.basic;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.tomcat.util.http.fileupload.FileUtils;


import java.io.*;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.*;

public class WifiProbeService5 {
    public static void main(String[] args) throws IOException {

//        String oldpath = "C:\\Users\\win7\\Desktop\\2017-08-21\\2017-08-21";
        String oldpath = "E:\\2017-08-29";
        String newpath = "E:\\godata2017-08-23**";
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
        Map<String, String> map = new HashMap<>();
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        Set<String> set = new HashSet<String>();
//        map.put("结束了", "kk");
        BufferedReader bufr = null;
        BufferedWriter bufw = null;
        FileWriter fw = null;
//        fw = new FileWriter(file5);
//        bufw = new BufferedWriter(fw);
        int b = 0;
        for (File file : files) {
            FileReader fr = null;

            try {
                fr = new FileReader(file);
                bufr = new BufferedReader(fr);
                // 一行一行的寫。
                String line = null;
                String name = null;
                int k = 1;
                while ((line = bufr.readLine()) != null) {
                    if (line.contains("busInfo")) {
                        JSONObject json = null;
                        json = JSONObject.parseObject(line);
                        String s = json.get("busInfo").toString();
                        Map<String, String> maps = (Map) JSON.parse(s);
                        map.put(file.getName().substring(0, file.getName().lastIndexOf("_Wi")), maps.get("line") + "-" + maps.get("busNo") + "-" + maps.get("company"));

                    }
                    if (line.contains("wifiInfo") && line.contains("}]}")) {
//                            line.last

                        k++;
                        JSONObject json = null;
                        try {
                            json = JSONObject.parseObject(line);

                        } catch (Exception e) {
                            //  System.err.println(file.getName() + "    =============");
                        }
                        String strs = null;
                        try {
                            strs = json.get("wifiInfo").toString();
                        } catch (Exception e) {
                            System.err.println(line.length());
                            System.err.println(file.getName());
                        }


                        List<HashMap> list = JSON.parseArray(strs, HashMap.class);
                        if (list != null && list.size() > 0) {
                            for (int a = 0; a < list.size(); a++) {
                                if (list.get(a).get("Mac").toString().contains("**")) {
                                    map2.put(file.getName().substring(0, file.getName().lastIndexOf("_Wi")), map.get(file.getName().substring(0, file.getName().lastIndexOf("_Wi"))));
                                    break;
                                }
//                                else {
//                                    map.remove(file.getName().substring(0, file.getName().lastIndexOf("_Wi")));
//                                  //  map1.put(file.getPath(), file.getName());
//                                    break;
//                                }


//                           }
//                           }

                            }
                        }

                    }
                }

                bufr.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        Iterator<Map.Entry<String, String>> it2 = map2.entrySet().iterator();

        while (it2.hasNext()) {
            Map.Entry<String, String> entry = it2.next();
            String value = entry.getValue();
            if(!StringUtils.contains(value, "null")&&value!=null&&value!="null"){
                System.err.println(entry.getValue());
            }



        }

//        Iterator<Map.Entry<String, String>> it = map1.entrySet().iterator();

//        while (it.hasNext()) {
//            Map.Entry<String, String> entry = it.next();
////            System.err.println(new File(entry.getKey()).toPath());
////            System.err.println(new File(newpath+File.separator+ entry.getValue()).toPath());
//            Files.copy(new File(entry.getKey()).toPath(), new File(newpath + File.separator + entry.getValue()).toPath());
//            files.clone();
////            String value = it.next().getValue();
////            System.err.println(value);
//        }

    }

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

    private static class BusInfo {
        private String line;
        private String busNo;
        private String company;
        private String remark;
        private String city;

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
    public static String yesterday(int day){
        Calendar   cal   =   Calendar.getInstance();
        cal.add(Calendar.DATE,   1);
        String yesterday = new SimpleDateFormat( "yyyy-MM-dd").format(cal.getTime());
        return yesterday;
    }
}
