package com.aaron.design.creation.singleton.way3;

/**
 * 懒汉式
 * 非线程安全的实现
 */
public class Singleton {
    private static Singleton singleton;
    private Singleton(){}

    public static Singleton getInstance(){
        if (singleton == null){
            return singleton = new Singleton();
        }
        return singleton;
    }
}
/**
 * 懒汉式
 * 线程安全的实现
 */
class Singleton2 {

    private static Singleton2 singleton;
    private Singleton2(){}

    public static synchronized Singleton2 getInstance(){
        if (singleton == null){
            return singleton = new Singleton2();
        }
        return singleton;
    }
}
