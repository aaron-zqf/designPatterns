package com.aaron.design.creation.factoryMethod;

/**
 * 创造人类工厂
 * @Created by aaron.zqf 2020/12/12
 */
public class HumanFactory extends AbstractHumanFactory{
    public <T extends Human> T createHuman(Class<T> c) {
        //定义一个生产的人种
        Human human = null;
        try {
            //创造一个人种
            human = (T)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) human;
    }
}
