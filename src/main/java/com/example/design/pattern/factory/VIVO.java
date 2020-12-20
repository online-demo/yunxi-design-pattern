package com.example.design.pattern.factory;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2020-12-20 11:34
 * @Version : V1.0
 * @Description : vivo手机
 */
public class VIVO implements Phone {
    /**
     * 打电话
     */
    @Override
    public void call() {
        System.out.println("用vivo手机打电话");
    }
}
