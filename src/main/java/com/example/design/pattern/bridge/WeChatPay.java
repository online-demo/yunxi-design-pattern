package com.example.design.pattern.bridge;

import java.math.BigDecimal;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-10 13:22
 * @Version : V1.0
 * @Description : 微信支付
 */
public class WeChatPay extends Pay {
    public WeChatPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        System.out.printf("模拟微信渠道支付划账开始。uId：%s tradeId：%s amount：%s", uId, tradeId, amount);
        boolean security = payMode.security(uId);
        System.out.printf("模拟微信渠道支付风控校验。uId：%s tradeId：%s security：%s", uId, tradeId, security);
        if (!security) {
            System.out.printf("模拟微信渠道支付划账拦截。uId：%s tradeId：%s amount：%s", uId, tradeId, amount);
            return "0001";
        }
        System.out.printf("模拟微信渠道支付划账成功。uId：%s tradeId：%s amount：%s", uId, tradeId, amount);
        return "0000";
    }
}
