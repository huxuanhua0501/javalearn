package com.xuanhuahu.java.basic;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xuanhuahu.java.dao.BAIDUWifiProbeDao;
import org.apache.commons.lang3.StringUtils;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


import java.io.*;
import java.nio.file.Files;
import java.util.*;

@Component
@EnableScheduling
public class Service6 {
    @Scheduled(cron = "0 0/2 * * * ?") // 每分钟执行一次
    public void work() throws Exception {

        String oldpath = "E:\\不带星号\\新建文件夹";
        // System.err.println(path);
        File file2 = new File(oldpath);
        if (!file2.exists()) {
            file2.mkdirs();
        }

        // 目录下所有的文件
        File[] files = file2.listFiles();
        String url = null;
        BufferedReader bufr = null;
        for (File file : files) {
            FileReader fr = null;
            try {
                fr = new FileReader(file);
                bufr = new BufferedReader(fr);
                String line = null;
                int a= 1;
                while ((line = bufr.readLine()) != null) {
                    System.err.println(a++);
                    String[] strs = line.split("-");
                    int k = new BAIDUWifiProbeDao().selectb(strs[0], strs[1], strs[2]) ;
                    if(k<=0){
                        new BAIDUWifiProbeDao().insertb(strs[0], strs[1], strs[2]);
                    }

                }

                bufr.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.err.println("结束");

    }
//
//    public static void main(String[] args) {
//
//
//        String oldpath = "E:\\hhhh";
//        // System.err.println(path);
//        File file2 = new File(oldpath);
//        if (!file2.exists()) {
//            file2.mkdirs();
//        }
//
//        // 目录下所有的文件
//        File[] files = file2.listFiles();
//        String url = null;
//        BufferedReader bufr = null;
//        for (File file : files) {
//            FileReader fr = null;
//            try {
//                fr = new FileReader(file);
//                bufr = new BufferedReader(fr);
//                String line = null;
//                while ((line = bufr.readLine()) != null) {
//                    String[] strs = line.split("-");
//                    new BAIDUWifiProbeDao().insert(strs[0], strs[1], strs[2]);
//
//                }
//
//                bufr.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//
//
//    }


}



