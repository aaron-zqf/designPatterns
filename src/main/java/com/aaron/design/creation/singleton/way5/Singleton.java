package com.aaron.design.creation.singleton.way5;

/**
 * 懒汉之静态内部类的方式
 * 这种方式能保证线程的安全线性，当Singleton被装载时，并不会立刻实例化静态内部类SingletonInstance，而是在需要时才会实例化
 * @Created by aaron.zqf 2020/12/12
 */
public class Singleton {
    private static class SingletonInstance{
        private static final Singleton singleton = new Singleton();
    }
    private Singleton(){}

    public static Singleton getInstance(){
        return SingletonInstance.singleton;
    }
}
