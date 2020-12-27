package com.example.design.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2020-12-27 13:19
 * @Version : V1.0
 * @Description : 套餐接口
 */
public class Meal {
    private List<Food> foodList = new ArrayList<>();

    public void addFood(Food food) {
        foodList.add(food);
    }

    public float getCost() {
        float cost = 0f;
        for (Food food : foodList) {
            cost += food.price();
        }
        return cost;
    }

    public void showFood() {
        for (Food food : foodList) {
            System.out.print("Food : " + food.name());
            System.out.print(", Packing : " + food.packing().pack());
            System.out.println(", Price : " + food.price());
        }
    }
}
