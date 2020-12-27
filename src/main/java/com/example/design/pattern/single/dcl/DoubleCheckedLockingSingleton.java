package com.example.design.pattern.single.dcl;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2020-12-27 11:54
 * @Version : V1.0
 * @Description : DCL模式单例
 */
public class DoubleCheckedLockingSingleton {
    /**
     * volatile保证可见性
     */
    private volatile static DoubleCheckedLockingSingleton singleton;

    /**
     * 构造器私有化
     */
    private DoubleCheckedLockingSingleton() {

    }

    public static DoubleCheckedLockingSingleton getInstance() {
        // 如果singleton不为空则直接返回singleton对象。
        // 如果singleton等于空，则加锁进行实例化。
        if (singleton == null) {
            // 加锁进行实例化。
            synchronized (DoubleCheckedLockingSingleton.class) {
                // 锁可能会阻塞，期间可能被其他线程实例化了DoubleCheckedLockingSingleton对象。
                // 所以再次校验singleton是否为空。
                if (singleton == null) {
                    singleton = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return singleton;
    }
}
