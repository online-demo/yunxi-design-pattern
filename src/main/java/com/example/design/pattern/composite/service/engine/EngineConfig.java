package com.example.design.pattern.composite.service.engine;

import com.example.design.pattern.composite.service.logic.LogicFilter;
import com.example.design.pattern.composite.service.logic.UserAgeFilter;
import com.example.design.pattern.composite.service.logic.UserGenderFilter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-17 23:36
 * @Version : V1.0
 * @Description :
 */
public class EngineConfig {

    static Map<String, LogicFilter> logicFilterMap;

    static {
        logicFilterMap = new ConcurrentHashMap<>();
        logicFilterMap.put("userAge", new UserAgeFilter());
        logicFilterMap.put("userGender", new UserGenderFilter());
    }

}