package com.aaron.design.creation.build;

/**
 * 宝马模型代码
 * @Created by aaron.zqf 2020/12/12
 */
public class BMWModel extends CarModel{
    protected void start() {
        System.out.println("宝马车跑起来是这个样子的...");
    }

    protected void stop() {
        System.out.println("宝马车应该这样停车...");
    }

    protected void alarm() {
        System.out.println("宝马车的喇叭声音是这个样子的...");
    }

    protected void engineBoom() {
        System.out.println("宝马车的引擎是这个声音的...");
    }
}
