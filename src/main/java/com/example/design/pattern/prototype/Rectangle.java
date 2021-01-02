package com.example.design.pattern.prototype;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-01 11:41
 * @Version : V1.0
 * @Description : 矩形
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}
