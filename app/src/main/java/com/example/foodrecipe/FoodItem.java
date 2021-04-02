package com.example.foodrecipe;

public class FoodItem {
    private String foodName;
    private int foodImage;

    public FoodItem(String foodName, int foodImage) {
        this.foodName = foodName;
        this.foodImage = foodImage;
    }

    public String getFoodName() {
        return foodName;
    }

    public int getFoodImage() {
        return foodImage;
    }
}
