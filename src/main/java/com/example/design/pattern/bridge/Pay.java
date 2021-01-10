package com.example.design.pattern.bridge;

import java.math.BigDecimal;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-10 13:21
 * @Version : V1.0
 * @Description : 支付工具
 */
public abstract class Pay {
    /**
     * 支付模式
     */
    protected IPayMode payMode;

    /**
     * 构造器
     * @param payMode
     */
    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    /**
     * 转账
     *
     * @param uId
     * @param tradeId
     * @param amount
     * @return
     */
    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
