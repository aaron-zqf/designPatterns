package com.aaron.design.creation.factoryMethod;

/**
 * 白种人
 * @Created by aaron.zqf 2020/12/12
 */
public class WhiteHuman implements Human{
    public void getColor(){
        System.out.println("白色人种的皮肤颜色是白色的！");
    }
    public void talk() {
        System.out.println("白色人种会说话，一般都是但是单字节。");
    }
}
