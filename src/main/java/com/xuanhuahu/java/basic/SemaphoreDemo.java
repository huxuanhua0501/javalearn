//package com.xuanhuahu.java.basic;
//
//import java.util.concurrent.Semaphore;
//
///**
// * Created by win7 on 2017/6/2.
// */
//public class SemaphoreDemo {
//
//    public static void main(String[] args) {
//        Semaphore semaphore = new Semaphore(5);
//
//        int N = 8;
//        for(int i = 0 ;i<N; i++){
//            new Worker(i,semaphore).start();
//        }
//    }
//    static  class  Worker extends Thread{
//        private  int num;
//        private  Semaphore semaphore;
//
//
//        public   Worker(int num ,Semaphore semaphore){
//            this.num = num;
//            this.semaphore = semaphore;
//        }
//
//        @Override
//        public void run() {
//            try {
//                semaphore.acquire();
//                System.err.println(this.num);
//                Thread.sleep(1000);
//                System.err.println("===="+this.num);
//                semaphore.release();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
