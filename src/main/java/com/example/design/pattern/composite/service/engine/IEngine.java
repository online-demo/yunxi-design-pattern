package com.example.design.pattern.composite.service.engine;

import com.example.design.pattern.composite.model.EngineResult;
import com.example.design.pattern.composite.model.TreeRich;

import java.util.Map;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-17 23:34
 * @Version : V1.0
 * @Description :
 */
public interface IEngine {
    EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final Map<String, String> decisionMatter);

}
