package com.example.design.pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2021-01-10 16:24
 * @Version : V1.0
 * @Description : 男性标准
 */
public class CriteriaMale implements Criteria {
    /**
     * 符合标准
     *
     * @param persons
     * @return
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
