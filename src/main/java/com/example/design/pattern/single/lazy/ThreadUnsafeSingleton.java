package com.example.design.pattern.single.lazy;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2020-12-27 11:33
 * @Version : V1.0
 * @Description : 懒汉模式非线程安全实现
 */
public class ThreadUnsafeSingleton {

    /**
     * 单例对象——延迟实例化
     */
    private static ThreadUnsafeSingleton threadUnsafeSingleton;

    /**
     * 构造函数私有化
     */
    private ThreadUnsafeSingleton() {

    }

    /**
     * 在使用到Singleton对象的时候进行实例化——延迟实例化
     *
     * @return 单例对象
     */
    public static ThreadUnsafeSingleton getInstance() {
        if (threadUnsafeSingleton == null) {
            threadUnsafeSingleton = new ThreadUnsafeSingleton();
        }
        return threadUnsafeSingleton;
    }

}
