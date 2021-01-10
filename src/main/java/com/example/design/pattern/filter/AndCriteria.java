package com.example.design.pattern.filter;

import java.util.List;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-10 16:26
 * @Version : V1.0
 * @Description : 且运算
 */
public class AndCriteria implements Criteria {
    /**
     * 标准1
     */
    private Criteria criteria;
    /**
     * 标准1
     */
    private Criteria otherCriteria;
    /**
     * 构造器初始化标准1和标准2
     */
    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        // 过滤符合标准1的用户
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        // 过滤符合标准2的用户
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
