package com.aaron.design.creation.factoryMethod;

/**
 * 接口Human是对人类的总称，每个人种都至少具有两个方法，黑色人种、黄色人种、白 色人
 * @Created by aaron.zqf 2020/12/12
 */
public interface Human {
    /**
     * 每个人种的皮肤都有相应的颜色
     */
    public void getColor();

    /**
     * 人类会说话
     */
    public void talk();
}
