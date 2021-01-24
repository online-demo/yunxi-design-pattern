package com.example.design.pattern.decorator;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-24 15:32
 * @Version : V1.0
 * @Description : 创建扩展了 ShapeDecorator 类的实体装饰类
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder();
    }

    private void setRedBorder(){
        System.out.println("Border Color: Red");
    }
}
