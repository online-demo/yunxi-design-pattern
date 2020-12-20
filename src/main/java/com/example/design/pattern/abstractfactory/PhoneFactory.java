package com.example.design.pattern.abstractfactory;

import com.example.design.pattern.factory.HUAWEI;
import com.example.design.pattern.factory.OPPO;
import com.example.design.pattern.factory.Phone;
import com.example.design.pattern.factory.VIVO;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2020-12-20 12:50
 * @Version : V1.0
 * @Description : 手机工厂
 */
public class PhoneFactory extends AbstractFactory {
    public static final String HUAWEI = "HUAWEI";
    public static final String OPPO = "OPPO";
    public static final String VIVO = "VIVO";

    /**
     * 创建手机
     *
     * @param phoneType 手机类型
     * @return 手机
     */
    @Override
    public Phone createPhone(String phoneType) {
        if (phoneType == null || phoneType.length() == 0) {
            return null;
        }
        switch (phoneType) {
            case HUAWEI:
                return new HUAWEI();
            case OPPO:
                return new OPPO();
            case VIVO:
                return new VIVO();
            default:
                return null;
        }
    }

    /**
     * 创造手机壳
     *
     * @param color 颜色
     * @return 手机壳
     */
    @Override
    public PhoneShell createPhoneShell(String color) {
        return null;
    }
}
