package com.example.design.pattern.adapter;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-01 17:29
 * @Version : V1.0
 * @Description : VLC播放器
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
