package com.aaron.design.creation.prototype;

/**
 * 长方形
 * @Created by aaron.zqf 2020/12/12
 */
public class Rectangle extends Shape{
    public Rectangle(){
        type = "Rectangle";
    }
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
