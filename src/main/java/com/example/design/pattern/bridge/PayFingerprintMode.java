package com.example.design.pattern.bridge;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-10 13:30
 * @Version : V1.0
 * @Description : 指纹支付
 */
public class PayFingerprintMode implements IPayMode {
    @Override
    public boolean security(String uId) {
        System.out.println("指纹支付，风控校验指纹信息");
        return true;
    }
}
