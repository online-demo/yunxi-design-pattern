package com.example.design.pattern.prototype;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-01 11:48
 * @Version : V1.0
 * @Description : 原型模式demo
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape circle = ShapeCache.getShape("1");
        System.out.print(circle.getType() + ":");
        circle.draw();

        Shape square = ShapeCache.getShape("2");
        System.out.print(square.getType() + ":");
        square.draw();

        Shape rectangle = ShapeCache.getShape("3");
        System.out.print(rectangle.getType() + ":");
        rectangle.draw();
    }
}
