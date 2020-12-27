package com.example.design.pattern.single.lazy;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2020-12-27 11:43
 * @Version : V1.0
 * @Description : 线程安全的单例模式
 */
public class ThreadSafeSingleton {

    /**
     * 单例对象——延迟实例化
     */
    private static ThreadSafeSingleton threadSafeSingleton;

    /**
     * 构造函数私有化
     */
    private ThreadSafeSingleton() {

    }

    /**
     * 线程安全的单例模式
     *
     * @return 单例对象
     */
    public static synchronized ThreadSafeSingleton getInstance() {
        if (threadSafeSingleton == null) {
            threadSafeSingleton = new ThreadSafeSingleton();
        }
        return threadSafeSingleton;
    }
}
