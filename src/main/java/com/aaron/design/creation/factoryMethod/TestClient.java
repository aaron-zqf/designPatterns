package com.aaron.design.creation.factoryMethod;

/**
 * 工厂方法设计模式测试
 * @Created by aaron.zqf 2020/12/12
 */
public class TestClient {
    public static void main(String[] args) {
        AbstractHumanFactory humanFactory = new HumanFactory();
        //创造白种人
        System.out.println("开始创造白种人...");
        Human whiteHuman = humanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        System.out.println("================================");

        //创造黑种人
        System.out.println("创造黑种人...");
        Human blackHuman = humanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        System.out.println("================================");

        //创造黄种人
        System.out.println("创造黄种人...");
        humanFactory.createHuman(YellowHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
    }

}