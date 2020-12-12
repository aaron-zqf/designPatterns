package com.aaron.design.creation.build;

import java.util.ArrayList;

/**
 * 测试构建者模式
 * @Created by aaron.zqf 2020/12/12
 */
public class TestClient {
    public static void main(String[] args) {
        /** 客户告诉XX公司，我要这样一个模型，然后XX公司就告诉我老大 * 说要这样一个模型，这样一个顺序，然后我就来制造 */
        //存放run的顺序
        ArrayList<String> sequence = new ArrayList<String>();
        sequence.add("engine boom");
        //客户要求，run时候时候先发动引擎
        sequence.add("start");
        //启动起来
        sequence.add("stop");
        //开了一段就停下来

        //要一个奔驰车：
        BenzBuilder benzBuilder = new BenzBuilder();
        //把顺序给这个builder类，制造出这样一个车出来
        benzBuilder.setSequence(sequence);
        //制造出一个奔驰车
        BenzModel benz = (BenzModel)benzBuilder.getCarModel();
        //奔驰车跑一下看看
        benz.run();

        System.out.println("===========================================");

        //要一个宝马车：
        BMWBuilder bmwBuilder = new BMWBuilder();
        //把顺序给这个builder类，制造出这样一个车出来
        bmwBuilder.setSequence(sequence);
        //制造出一个奔驰车
        BMWModel bmw = (BMWModel)bmwBuilder.getCarModel();
        //宝马车跑一下看看
        bmw.run();
    }

}
