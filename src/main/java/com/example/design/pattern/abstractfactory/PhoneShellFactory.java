package com.example.design.pattern.abstractfactory;
import com.example.design.pattern.factory.Phone;


/**
 * @Author : 无双老师【云析学院】
 * @Date : 2020-12-20 12:44
 * @Version : V1.0
 * @Description : 手机壳工厂
 */
public class PhoneShellFactory extends AbstractFactory{
    public static final String RED = "RED";
    public static final String BLUE = "BLUE";
    public static final String BLACK = "BLACK";

    /**
     * 创造手机
     *
     * @param phoneType 手机类型
     * @return 手机
     */
    @Override
    public Phone createPhone(String phoneType) {
        return null;
    }

    /**
     * 创建手机壳
     *
     * @param color 颜色
     * @return 手机壳
     */
    @Override
    public PhoneShell createPhoneShell(String color) {
        if (color == null || color.length() == 0) {
            return null;
        }
        switch (color) {
            case RED:
                return new RedPhoneShell();
            case BLUE:
                return new BluePhoneShell();
            case BLACK:
                return new BlackPhoneShell();
            default:
                return null;
        }
    }
}
