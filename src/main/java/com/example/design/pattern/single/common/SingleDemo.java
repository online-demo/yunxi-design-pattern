package com.example.design.pattern.single.common;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2020-12-27 11:11
 * @Version : V1.0
 * @Description : 单例模式demo
 */
public class SingleDemo {
    public static void main(String[] args) {
        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //Single object = new Single();

        // 获取单例对象
        Single singleInstance = Single.getInstance();
        singleInstance.sayHello();
    }
}
