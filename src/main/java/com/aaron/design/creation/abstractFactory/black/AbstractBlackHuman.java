package com.aaron.design.creation.abstractFactory.black;


import com.aaron.design.creation.abstractFactory.Human;

/**
 * 黑种人
 * @Created by aaron.zqf 2020/12/12
 */
public abstract class AbstractBlackHuman implements Human {
    public void getColor() {
        System.out.println("黑色人种的皮肤颜色是黑色的！");
    }
    public void talk() {
        System.out.println("黑人会说话，一般人听不懂。");
    }
}
