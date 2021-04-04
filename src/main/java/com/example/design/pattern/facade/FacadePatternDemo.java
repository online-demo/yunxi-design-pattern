package com.example.design.pattern.facade;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-31 11:22
 * @Version : V1.0
 * @Description : 使用该外观类画出各种类型的形状
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
