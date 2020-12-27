package com.example.design.pattern.builder;

/**
 * @Author : 无双老师【云析学院】
 * @Date : 2020-12-27 13:27
 * @Version : V1.0
 * @Description : 建造者模式demo
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showFood();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\nNon-Veg Meal");
        nonVegMeal.showFood();
        System.out.println("Total Cost: " +nonVegMeal.getCost());
    }
}
