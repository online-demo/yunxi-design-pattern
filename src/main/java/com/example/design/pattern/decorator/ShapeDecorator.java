package com.example.design.pattern.decorator;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-24 15:32
 * @Version : V1.0
 * @Description : 创建实现了 Shape 接口的抽象装饰类
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw(){
        decoratedShape.draw();
    }
}
