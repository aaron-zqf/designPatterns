package com.aaron.design.creation.singleton.way6;

/**
 * 枚举实现单例
 * 实现简单、线程安全、可以防止反序列化、反射的方式破坏单例模式，如果通过反序列化或反射的方式创建实例，会抛出异常。这种方式是最好的实现的方式
 * @Created by aaron.zqf 2020/12/12
 */
public enum Singleton {

    INSTANCE;
    public void whateverMethod(){

    }
}
