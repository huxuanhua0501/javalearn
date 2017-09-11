package com.xuanhuahu.java.basic;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ReadFileName {
    public static void main(String[] args) throws IOException {
        BufferedReader bufr = null;
        File readFile = new File("C:\\Users\\win7\\Desktop\\日志\\log\\log_info.log");
        FileReader fr = new FileReader(readFile);
        bufr = new BufferedReader(fr);
        String line = null;
        Map<String, Object> map = new HashMap<>();
        while ((line = bufr.readLine()) != null) {
            String key = line.substring(line.indexOf("fileName==="), line.lastIndexOf(";fileSize"));
//            System.err.println(line.substring(line.indexOf("fileName==="), line.lastIndexOf(";fileSize")));
               if(map.containsKey(key)){
                   System.err.println(key);
               }else{
                   map.put(key,"null");
               }

        }
//        System.err.println("");

//        String str = "===2017-09-05 00:00:00.077 INFO  com.wifiprobe.controller.WifiProbeController Line:51  - 2017-09-05 00:00:00;fileName===RjPeSIDTIsY._WiFiProbe_1504530814.log;fileSize==185284";
//        System.err.println(str.substring(str.indexOf("fileName==="), str.lastIndexOf(";fileSize")));

    }
}
