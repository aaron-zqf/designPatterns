package com.aaron.design.creation.build;

import java.util.ArrayList;

/**
 * 奔驰车组装者
 * @Created by aaron.zqf 2020/12/12
 */
public class BenzBuilder extends CarBuilder{
    private BenzModel benz = new BenzModel();
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    public CarModel getCarModel() {
        return this.benz;
    }
}
