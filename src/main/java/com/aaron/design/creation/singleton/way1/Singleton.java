package com.aaron.design.creation.singleton.way1;

/**
 * 饿汉式
 * 程序启动的时候就会实例化
 * @Created by aaron.zqf 2020/12/12
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return singleton;
    }
}
