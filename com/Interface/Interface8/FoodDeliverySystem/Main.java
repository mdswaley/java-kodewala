package com.Interface.Interface8.FoodDeliverySystem;

class Main {
    public static void main(String[] args) {
        IFoodDelivery foodDelivery = new PremiumDelivery();

        foodDelivery.scheduleDelivery();
    }
}
