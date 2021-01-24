package com.example.design.pattern.composite;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-17 23:09
 * @Version : V1.0
 * @Description : 规则引擎
 */
public class RuleEngine {

    public static String process(final String userId, final String userSex, final int userAge) {

        System.out.printf("if-else实现方式判断用户结果。userId：%s userSex：%s userAge：%s", userId, userSex, userAge);
        // 如果是男生
        if ("man".equals(userSex)) {
            // 如果是小于25岁的男生
            if (userAge < 25) {
                return "果实A";
            }
            // 如果是大于等于25岁的男生
            if (userAge >= 25) {
                return "果实B";
            }
        }
        // 如果是女生
        if ("woman".equals(userSex)) {
            // 如果是小于25岁的女生
            if (userAge < 25) {
                return "果实C";
            }
            // 如果是大于等于25岁的女生
            if (userAge >= 25) {
                return "果实D";
            }
        }

        return null;
    }


    public static void main(String[] args) {
        String process = process("Oli09pLkdjh", "man", 29);
        System.out.printf("\n测试结果：%s", process);
    }
}
