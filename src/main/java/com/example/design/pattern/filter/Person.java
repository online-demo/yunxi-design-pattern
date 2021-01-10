package com.example.design.pattern.filter;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-10 16:21
 * @Version : V1.0
 * @Description : 用户类
 */
public class Person {
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private String gender;
    /**
     * 婚姻状况
     */
    private String maritalStatus;

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }
}
