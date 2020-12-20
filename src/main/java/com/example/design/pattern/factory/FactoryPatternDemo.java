package com.example.design.pattern.factory;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2020-12-20 11:44
 * @Version : V1.0
 * @Description : 工厂模式demo
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone huawei = phoneFactory.createPhone(PhoneFactory.HUAWEI);
        huawei.call();
        Phone oppo = phoneFactory.createPhone(PhoneFactory.OPPO);
        oppo.call();
        Phone vivo = phoneFactory.createPhone(PhoneFactory.VIVO);
        vivo.call();
    }
}
