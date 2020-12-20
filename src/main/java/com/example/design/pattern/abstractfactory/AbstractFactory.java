package com.example.design.pattern.abstractfactory;

import com.example.design.pattern.factory.Phone;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2020-12-20 12:37
 * @Version : V1.0
 * @Description : 抽象工厂
 */
public abstract class AbstractFactory {
    /**
     * 创造手机
     *
     * @param phoneType 手机类型
     * @return 手机
     */
    public abstract Phone createPhone(String phoneType);

    /**
     * 创造手机壳
     *
     * @param color 颜色
     * @return 手机壳
     */
    public abstract PhoneShell createPhoneShell(String color);
}
