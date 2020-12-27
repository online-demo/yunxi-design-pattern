package com.example.design.pattern.builder;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2020-12-27 13:25
 * @Version : V1.0
 * @Description : 创建套餐对象
 */
public class MealBuilder {
    /**
     * 创建素食套餐
     *
     * @return 套餐
     */
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addFood(new VegBurger());
        meal.addFood(new Coke());
        return meal;
    }

    /**
     * 创建肌肉套餐
     *
     * @return 套餐
     */
    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addFood(new ChickenBurger());
        meal.addFood(new Pepsi());
        return meal;
    }
}
