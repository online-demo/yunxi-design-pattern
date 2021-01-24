package com.example.design.pattern.composite.service.engine;

import com.example.design.pattern.composite.model.EngineResult;
import com.example.design.pattern.composite.model.TreeNode;
import com.example.design.pattern.composite.model.TreeRich;
import com.example.design.pattern.composite.model.TreeRoot;
import com.example.design.pattern.composite.service.logic.LogicFilter;

import java.util.Map;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-17 23:35
 * @Version : V1.0
 * @Description :
 */
public abstract class EngineBase extends EngineConfig implements IEngine {

    @Override
    public abstract EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter);

    protected TreeNode engineDecisionMaker(TreeRich treeRich, Long treeId, String userId, Map<String, String> decisionMatter) {
        TreeRoot treeRoot = treeRich.getTreeRoot();
        Map<Long, TreeNode> treeNodeMap = treeRich.getTreeNodeMap();
        // 规则树根ID
        Long rootNodeId = treeRoot.getTreeRootNodeId();
        TreeNode treeNodeInfo = treeNodeMap.get(rootNodeId);
        //节点类型[NodeType]；1子叶、2果实
        while (treeNodeInfo.getNodeType().equals(1)) {
            String ruleKey = treeNodeInfo.getRuleKey();
            LogicFilter logicFilter = logicFilterMap.get(ruleKey);
            String matterValue = logicFilter.matterValue(treeId, userId, decisionMatter);
            Long nextNode = logicFilter.filter(matterValue, treeNodeInfo.getTreeNodeLinkList());
            treeNodeInfo = treeNodeMap.get(nextNode);
            System.out.printf("\n决策树引擎=>%s userId：%s treeId：%s treeNode：%s ruleKey：%s matterValue：%s\n", treeRoot.getTreeName(), userId, treeId, treeNodeInfo.getTreeNodeId(), ruleKey, matterValue);
        }
        return treeNodeInfo;
    }

}
