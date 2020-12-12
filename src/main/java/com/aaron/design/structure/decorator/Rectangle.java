package com.aaron.design.structure.decorator;

/**
 * 创建实现接口的实长方形体类。
 * @Created by aaron.zqf 2020/12/12
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}