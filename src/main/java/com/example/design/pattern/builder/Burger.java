package com.example.design.pattern.builder;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2020-12-27 13:11
 * @Version : V1.0
 * @Description : 汉堡
 */
public abstract class Burger implements Food {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
