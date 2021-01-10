package com.example.design.pattern.bridge;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-10 13:26
 * @Version : V1.0
 * @Description : 密码支付
 */
public class PayCypher implements IPayMode {

    @Override
    public boolean security(String uId) {
        System.out.println("密码支付，风控校验环境安全");
        return true;
    }
}
