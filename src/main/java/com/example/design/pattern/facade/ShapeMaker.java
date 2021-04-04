package com.example.design.pattern.facade;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-31 11:21
 * @Version : V1.0
 * @Description : 创建一个外观类
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
