package com.example.design.pattern.abstractfactory;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2020-12-20 12:33
 * @Version : V1.0
 * @Description : 红色手机壳
 */
public class RedPhoneShell implements PhoneShell {
    /**
     * 手机壳颜色
     */
    @Override
    public void color() {
        System.out.println("红色手机壳");
    }
}
