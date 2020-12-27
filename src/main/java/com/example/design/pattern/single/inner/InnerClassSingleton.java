package com.example.design.pattern.single.inner;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2020-12-27 12:10
 * @Version : V1.0
 * @Description : 内部类模式单例
 */
public class InnerClassSingleton {
    /**
     * 静态内部类
     */
    private static class SingletonHolder {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    private InnerClassSingleton() {

    }

    public static final InnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
