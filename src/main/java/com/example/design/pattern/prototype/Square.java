package com.example.design.pattern.prototype;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-01 11:43
 * @Version : V1.0
 * @Description : 正方形
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("画一个正方形");
    }
}
