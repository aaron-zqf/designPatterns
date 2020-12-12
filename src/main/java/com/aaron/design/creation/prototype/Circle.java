package com.aaron.design.creation.prototype;

/**
 * 原型
 * @Created by aaron.zqf 2020/12/12
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
