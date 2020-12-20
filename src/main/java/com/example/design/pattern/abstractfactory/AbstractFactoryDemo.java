package com.example.design.pattern.abstractfactory;

import com.example.design.pattern.factory.Phone;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2020-12-20 12:51
 * @Version : V1.0
 * @Description : 抽象工厂demo
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory phoneFactory = FactoryProducer.createFactory(FactoryProducer.PHONE);
        Phone HUAWEI = phoneFactory.createPhone(PhoneFactory.HUAWEI);
        Phone OPPO = phoneFactory.createPhone(PhoneFactory.OPPO);
        Phone VIVO = phoneFactory.createPhone(PhoneFactory.VIVO);
        HUAWEI.call();
        OPPO.call();
        VIVO.call();

        AbstractFactory phoneShellFactory = FactoryProducer.createFactory(FactoryProducer.PHONE_SHELL);
        PhoneShell blackPhoneShell = phoneShellFactory.createPhoneShell(PhoneShellFactory.BLACK);
        PhoneShell bluePhoneShell = phoneShellFactory.createPhoneShell(PhoneShellFactory.BLUE);
        PhoneShell redPhoneShell = phoneShellFactory.createPhoneShell(PhoneShellFactory.RED);
        blackPhoneShell.color();
        bluePhoneShell.color();
        redPhoneShell.color();
    }
}
