package com.example.design.pattern.builder;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2020-12-27 13:06
 * @Version : V1.0
 * @Description : 食物接口
 */
public interface Food {
    /**
     * 食物名称
     *
     * @return 食物名称
     */
    String name();

    /**
     * 食物包装盒
     *
     * @return 食物包装盒
     */
    Packing packing();

    /**
     * 食物价格
     *
     * @return 食物价格
     */
    float price();
}
