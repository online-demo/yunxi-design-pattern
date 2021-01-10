package com.example.design.pattern.bridge;

import java.math.BigDecimal;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-10 13:35
 * @Version : V1.0
 * @Description : 测试类
 */
public class ApiTest {
    public static void main(String[] args) {

        System.out.println("\r\n模拟测试场景；微信支付、人脸方式。");
        Pay wxPay = new WeChatPay(new PayFaceMode());
        wxPay.transfer("weixin_1092033111", "100000109893", new BigDecimal(100));

        System.out.println("\r\n模拟测试场景；支付宝支付、指纹方式。");
        Pay zfbPay = new AliPay(new PayFingerprintMode());
        zfbPay.transfer("jlu19dlxo111", "100000109894", new BigDecimal(100));

    }
}
