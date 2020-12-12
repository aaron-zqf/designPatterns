package com.aaron.design.creation.abstractFactory;

import com.aaron.design.creation.abstractFactory.factory.FemaleFactory;
import com.aaron.design.creation.abstractFactory.factory.HumanFactory;
import com.aaron.design.creation.abstractFactory.factory.MaleFactory;

/**
 * 抽象工厂计模式测试
 * @Created by aaron.zqf 2020/12/12
 */
public class TestClient {
    public static void main(String[] args) {
        //男性创造工厂
        HumanFactory maleFactory = new MaleFactory();
        //女性创造工厂
        HumanFactory femaleFactory = new FemaleFactory();

        //黑人男性
        Human blackHuman = maleFactory.createBlackHuman();
        //白人男性
        Human whiteHuman = maleFactory.createWhiteHuman();
        //黄种人男性
        Human yellowHuman = maleFactory.createYellowHuman();

        System.out.println("黑种人男性已创建...");
        blackHuman.getColor();
        blackHuman.talk();
        blackHuman.getSex();

        System.out.println("==================================");

        System.out.println("白种人男性已创建...");
        whiteHuman.getColor();
        whiteHuman.talk();
        whiteHuman.getSex();

        System.out.println("==================================");

        System.out.println("黄种人男性已创建...");
        yellowHuman.getColor();
        yellowHuman.talk();
        yellowHuman.getSex();
    }

}