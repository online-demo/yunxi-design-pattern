package com.example.design.pattern.factory;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2020-12-20 11:32
 * @Version : V1.0
 * @Description : 华为手机
 */
public class HUAWEI implements Phone {
    /**
     * 打电话
     */
    @Override
    public void call() {
        System.out.println("用华为手机打电话");
    }
}
