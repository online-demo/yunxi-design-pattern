package com.example.design.pattern.composite.service.logic;

import java.util.Map;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-17 23:42
 * @Version : V1.0
 * @Description : 用户年龄过滤器
 */
public class UserAgeFilter extends BaseLogic {

    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("age");
    }

}
