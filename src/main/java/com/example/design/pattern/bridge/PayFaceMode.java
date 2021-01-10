package com.example.design.pattern.bridge;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-10 13:29
 * @Version : V1.0
 * @Description : 刷脸支付
 */
public class PayFaceMode implements IPayMode {

    @Override
    public boolean security(String uId) {
        System.out.println("人脸支付，风控校验脸部识别");
        return true;
    }
}
