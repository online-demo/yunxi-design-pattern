package com.example.design.pattern.single.hungry;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2020-12-27 11:48
 * @Version : V1.0
 * @Description : 饿汉模式单例实现
 */
public class HungrySingleton {

    /**
     * 类装载时就实例化
     */
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getHungrySingleton() {
        return hungrySingleton;
    }
}
