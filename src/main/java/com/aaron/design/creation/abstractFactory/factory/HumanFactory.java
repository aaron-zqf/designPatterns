package com.aaron.design.creation.abstractFactory.factory;

import com.aaron.design.creation.abstractFactory.Human;

/**
 * 创造人类工厂
 * @Created by aaron.zqf 2020/12/12
 */
public interface HumanFactory {
    /**
     * 创造黄种人
     * @return
     */
    public Human createYellowHuman();

    /**
     * 创造白种人
     * @return
     */
    public Human createWhiteHuman();

    /**
     * 创造黑种人
     * @return
     */
    public Human createBlackHuman();
}
