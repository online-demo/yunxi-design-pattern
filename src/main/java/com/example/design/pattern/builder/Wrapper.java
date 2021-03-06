package com.example.design.pattern.builder;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2020-12-27 13:13
 * @Version : V1.0
 * @Description : 纸盒
 */
public class Wrapper implements Packing {
    /**
     * 包装食物
     *
     * @return 包装盒
     */
    @Override
    public String pack() {
        return "纸盒";
    }
}
