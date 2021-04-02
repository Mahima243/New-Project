package com.example.foodrecipe;

public class FoodItem {
    private int id;
    private String foodName;
    private int foodImage;

    public FoodItem(String foodName, int foodImage, int id) {
        this.foodName = foodName;
        this.foodImage = foodImage;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getFoodName() {
        return foodName;
    }

    public int getFoodImage() {
        return foodImage;
    }
}
