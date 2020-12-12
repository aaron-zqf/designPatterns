package com.aaron.design.creation.abstractFactory.factory;


import com.aaron.design.creation.abstractFactory.Human;
import com.aaron.design.creation.abstractFactory.black.MaleBlackHuman;
import com.aaron.design.creation.abstractFactory.white.FemaleWhiteHuman;
import com.aaron.design.creation.abstractFactory.yellow.FemaleYellowHuman;

/**
 * 创造女性工厂类
 * @Created by aaron.zqf 2020/12/12
 */
public class FemaleFactory implements HumanFactory{
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
}
