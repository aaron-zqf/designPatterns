package com.aaron.design.structure.decorator;

/**
 * 创建实现接口的原型实体类。
 * @Created by aaron.zqf 2020/12/12
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}