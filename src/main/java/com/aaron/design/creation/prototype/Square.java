package com.aaron.design.creation.prototype;

/**
 * 正方形
 * @Created by aaron.zqf 2020/12/12
 */
public class Square extends Shape{
    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
