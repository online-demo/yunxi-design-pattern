package com.example.design.pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-10 16:25
 * @Version : V1.0
 * @Description : 单身标准
 */
public class CriteriaSingle implements Criteria {
    /**
     * 符合标准
     *
     * @param persons
     * @return
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
