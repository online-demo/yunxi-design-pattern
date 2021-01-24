package com.example.design.pattern.composite.service.logic;

import com.example.design.pattern.composite.model.TreeNodeLink;

import java.util.List;
import java.util.Map;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-17 23:38
 * @Version : V1.0
 * @Description : 逻辑过滤器
 */
public interface LogicFilter {

    /**
     * 逻辑决策器
     *
     * @param matterValue          决策值
     * @param treeNodeLineInfoList 决策节点
     * @return 下一个节点Id
     */
    Long filter(String matterValue, List<TreeNodeLink> treeNodeLineInfoList);

    /**
     * 获取决策值
     *
     * @param decisionMatter 决策物料
     * @return 决策值
     */
    String matterValue(Long treeId, String userId, Map<String, String> decisionMatter);

}
