package com.example.design.pattern.bridge;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-10 13:25
 * @Version : V1.0
 * @Description : 支付模式
 */
public interface IPayMode {
    /**
     * 安全校验
     *
     * @param uId
     * @return
     */
    boolean security(String uId);

}
