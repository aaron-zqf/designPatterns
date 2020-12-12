package com.aaron.design.creation.singleton.way4;

/**
 * 线程安全的实现，双重校验
 * 注意：两个校验都必须加，如果第二个没有加校验，当两个线程都通过了第一个if校验，此时会有一个线程进入同步代码块，创建singleton实例，
 * 接着第二个线程也会进入同步代码块，并会在创建一个singleton。那么这样就破坏了单例。如果不加第一个if校验，那么所有的程序就会串行执行，
 * 影响执行效率。所以两个校验都必须存在
 * @Created by aaron.zqf 2020/12/12
 */
public class Singleton {
    /**由于 return singleton = new Singleton(); 这行代码在JVM中会分为三步处理
     * 1.给singleton分配内存空间
     * 2.调用singleton的构造函数开初始化
     * 3.将singleton对象指向分配的内存空间（这步执行了就singleton就不是null了）
     *
     * 由于CPU会对这三个步骤重排序，如果顺序是1 3 2，那么就可能出现singleton就不是空的，但并没有初始化singleton
     * 这样第二个线程可能拿到的就是为初始化的singleton，所以使用volatile来修饰singleton,防止重排序的问题
     */
    private static volatile Singleton singleton;
    private Singleton(){}

    public static Singleton getInstance(){
        if (singleton == null){
            synchronized (Singleton.class) {
                if (singleton == null) {
                    return singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
