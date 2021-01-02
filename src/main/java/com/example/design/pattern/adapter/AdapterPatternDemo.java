package com.example.design.pattern.adapter;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-01 17:34
 * @Version : V1.0
 * @Description : 适配器模式demo
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "十年.mp3");
        audioPlayer.play("mp4", "夺冠.mp4");
        audioPlayer.play("vlc", "迷雾追凶.vlc");
        audioPlayer.play("avi", "巡回检察组.avi");
    }
}
