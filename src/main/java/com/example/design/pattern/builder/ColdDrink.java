package com.example.design.pattern.builder;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2020-12-27 13:15
 * @Version : V1.0
 * @Description : 冷饮
 */
public abstract class ColdDrink implements Food {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
