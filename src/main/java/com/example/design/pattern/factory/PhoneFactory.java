package com.example.design.pattern.factory;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2020-12-20 11:38
 * @Version : V1.0
 * @Description : 手机工厂
 */
public class PhoneFactory {

    public static final String HUAWEI = "HUAWEI";
    public static final String OPPO = "OPPO";
    public static final String VIVO = "VIVO";

    /**
     * 创建手机
     *
     * @param phoneType 手机类型
     * @return 手机
     */
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
}
