package com.aaron.design.structure.adapter;

/**
 * @Created by aaron.zqf 2020/12/12
 */
public class VlcPlayer implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }
    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}