package com.aaron.design.creation.build;

import java.util.ArrayList;

/**
 * 宝马车组装者
 * @Created by aaron.zqf 2020/12/12
 */
public class BMWBuilder extends CarBuilder {
    private BMWModel bmw = new BMWModel();
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    public CarModel getCarModel() {
        return this.bmw;
    }
}
