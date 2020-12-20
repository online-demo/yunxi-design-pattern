package com.example.design.pattern.abstractfactory;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2020-12-20 12:52
 * @Version : V1.0
 * @Description : 创建一个工厂创造器
 */
public class FactoryProducer {
    public static final String PHONE = "Phone";
    public static final String PHONE_SHELL = "PhoneShell";

    /**
     * 创建工厂
     *
     * @param factoryType 工厂类型
     * @return 工厂
     */
    public static AbstractFactory createFactory(String factoryType) {
        if (PHONE.equals(factoryType)) {
            return new PhoneFactory();
        } else if (PHONE_SHELL.equals(factoryType)) {
            return new PhoneShellFactory();
        }
        return null;
    }
}
