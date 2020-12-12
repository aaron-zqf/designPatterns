package com.aaron.design.creation.factoryMethod;

/**
 * 黑种人
 * @Created by aaron.zqf 2020/12/12
 */
public class BlackHuman implements Human{
    public void getColor() {
        System.out.println("黑色人种的皮肤颜色是黑色的！");
    }
    public void talk() {
        System.out.println("黑人会说话，一般人听不懂。");
    }
}
