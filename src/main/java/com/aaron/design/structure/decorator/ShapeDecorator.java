package com.aaron.design.structure.decorator;

/**
 * 创建实现了 Shape 接口的抽象装饰类。
 * @Created by aaron.zqf 2020/12/12
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}