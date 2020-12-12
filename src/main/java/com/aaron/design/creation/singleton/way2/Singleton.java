package com.aaron.design.creation.singleton.way2;

/**
 * 饿汉静态代码块方式
 * @Created by aaron.zqf 2020/12/12
 */
public class Singleton {
    private static Singleton singleton;
    static {
        singleton = new Singleton();
    }
    private Singleton(){}

    public static Singleton getInstance(){
        return singleton;
    }
}
