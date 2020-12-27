package com.example.design.pattern.single.common;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2020-12-27 11:06
 * @Version : V1.0
 * @Description : 单例类
 */
public class Single {
    /**
     * 创建一个Single对象
     */
    private static Single singleInstance = new Single();

    /**
     * 让构造函数为 private，这样该类就不会被实例化。
     */
    private Single() {

    }

    /**
     * 获取单例对象
     *
     * @return 返回单例对象
     */
    public static Single getInstance() {
        return singleInstance;
    }

    public void sayHello() {
        System.out.println("Hello Design Pattern");
    }
}
