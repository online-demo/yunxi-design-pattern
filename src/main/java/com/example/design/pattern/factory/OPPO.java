package com.example.design.pattern.factory;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2020-12-20 11:35
 * @Version : V1.0
 * @Description : oppo手机
 */
public class OPPO implements Phone {
    /**
     * 打电话
     */
    @Override
    public void call() {
        System.out.println("用OPPO手机打电话");
    }
}
