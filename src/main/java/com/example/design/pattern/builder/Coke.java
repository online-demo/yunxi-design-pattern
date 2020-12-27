package com.example.design.pattern.builder;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2020-12-27 13:18
 * @Version : V1.0
 * @Description : 可口可乐
 */
public class Coke extends ColdDrink {
    /**
     * 食物名称
     *
     * @return 食物名称
     */
    @Override
    public String name() {
        return "可口可乐";
    }

    /**
     * 食物价格
     *
     * @return 食物价格
     */
    @Override
    public float price() {
        return 5;
    }
}
