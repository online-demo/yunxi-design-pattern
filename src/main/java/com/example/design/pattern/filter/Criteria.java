package com.example.design.pattern.filter;

import java.util.List;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-10 16:23
 * @Version : V1.0
 * @Description : 过滤标准接口
 */
public interface Criteria {
    /**
     * 符合标准
     *
     * @param persons
     * @return
     */
    List<Person> meetCriteria(List<Person> persons);
}
