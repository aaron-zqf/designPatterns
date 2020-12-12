package com.aaron.design.creation.abstractFactory.yellow;


import com.aaron.design.creation.abstractFactory.Human;

/**
 * 黄种人
 * @Created by aaron.zqf 2020/12/12
 */
public abstract class AbstractYellowHuman implements Human {
    public void getColor() {
        System.out.println("黄色人种的皮肤颜色是黄色的！");
    }

    public void talk() {
        System.out.println("黄色人种会说话，一般说的都是双字节。");
    }
}
