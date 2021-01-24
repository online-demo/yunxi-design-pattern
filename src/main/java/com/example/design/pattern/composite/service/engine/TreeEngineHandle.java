package com.example.design.pattern.composite.service.engine;

import com.example.design.pattern.composite.model.EngineResult;
import com.example.design.pattern.composite.model.TreeNode;
import com.example.design.pattern.composite.model.TreeRich;

import java.util.Map;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-17 23:51
 * @Version : V1.0
 * @Description :
 */
public class TreeEngineHandle extends EngineBase {

    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        // 决策流程
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId, decisionMatter);
        // 决策结果
        return new EngineResult(userId, treeId, treeNode.getTreeNodeId(), treeNode.getNodeValue());
    }

}
