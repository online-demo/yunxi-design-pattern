package com.example.design.pattern.flyweight;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-31 13:11
 * @Version : V1.0
 * @Description : 使用该工厂，通过传递颜色信息来获取实体类的对象
 */
public class FlyweightPatternDemo {
    private static final String[] COLORS =
            {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {

        for (int i = 0; i < 20; ++i) {
            Circle circle =
                    (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return COLORS[(int) (Math.random() * COLORS.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
