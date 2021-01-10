package com.example.design.pattern.filter;

import java.util.List;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-10 16:28
 * @Version : V1.0
 * @Description : 或运算
 */
public class OrCriteria implements Criteria {
    /**
     * 标准1
     */
    private Criteria criteria;
    /**
     * 标准2
     */
    private Criteria otherCriteria;

    /**
     * 构造器初始化标准1和标准2
     */
    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        // 过滤满足标准1的用户
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        // 过滤满足标准2的用户
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);
        // 取交接
        for (Person person : otherCriteriaItems) {
            if (!firstCriteriaItems.contains(person)) {
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}
