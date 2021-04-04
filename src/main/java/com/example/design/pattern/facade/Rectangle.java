package com.example.design.pattern.facade;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-31 11:20
 * @Version : V1.0
 * @Description : 创建实现接口的实体类
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
