package com.example.design.pattern.prototype;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-01 11:43
 * @Version : V1.0
 * @Description : 圆形
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("画一个圆形");
    }
}
