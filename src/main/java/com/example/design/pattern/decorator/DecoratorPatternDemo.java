package com.example.design.pattern.decorator;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-24 15:33
 * @Version : V1.0
 * @Description : 使用 RedShapeDecorator 来装饰 Shape 对象
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();
        // 装饰器装饰圆形
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        // 装饰器装饰矩形
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
