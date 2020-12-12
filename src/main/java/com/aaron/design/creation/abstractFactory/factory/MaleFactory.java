package com.aaron.design.creation.abstractFactory.factory;

import com.aaron.design.creation.abstractFactory.Human;
import com.aaron.design.creation.abstractFactory.black.MaleBlackHuman;
import com.aaron.design.creation.abstractFactory.white.MaleWhiteHuman;
import com.aaron.design.creation.abstractFactory.yellow.MaleYellowHuman;

/**
 * 创造男性人类工厂类
 * @Created by aaron.zqf 2020/12/12
 */
public class MaleFactory implements HumanFactory{
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
}
