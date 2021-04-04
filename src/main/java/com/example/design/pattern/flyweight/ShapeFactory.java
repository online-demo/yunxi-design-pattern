package com.example.design.pattern.flyweight;

import java.util.HashMap;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-31 13:10
 * @Version : V1.0
 * @Description : 创建一个工厂，生成基于给定信息的实体类的对象
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}