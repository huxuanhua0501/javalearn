package com.xuanhuahu.java.factory;

/**
 * Created by win7 on 2017/6/7.
 * 单例模式，解决大量 创建对象，对堆内存造成不必要的压力
 */
public class Singleton {
    private static Singleton instance = null;

    private Singleton() {

    }

    /**
     * 非线程安全
     *
     * @return
     */
    public static Singleton getInstance1() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * 线程安全
     *
     * @return
     */
    public static synchronized Singleton getInstance2() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new Singleton();//对象初始化过程中有可能出错
                }
            }
        }
        return instance;
    }

    /**
     * 认为应该没问题了。
     */
    private static class SingletonFactroy {
        private static Singleton instance = new Singleton();

        public static Singleton getInstance() {
            return SingletonFactroy.instance;
        }
    }
}
