package com.example.design.pattern.adapter;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-01 17:30
 * @Version : V1.0
 * @Description : MP4播放器
 */
public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
