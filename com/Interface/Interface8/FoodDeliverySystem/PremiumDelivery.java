package com.Interface.Interface8.FoodDeliverySystem;

class PremiumDelivery implements IFoodDelivery{
    @Override
    public void placeOrder() {
        System.out.println("Order placed with Premium delivery");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order is canceled for Premium delivery");
    }

    @Override
    public void trackOrder() {
        System.out.println("Order is tracking for Premium delivery");
    }

    @Override
    public void searchRestaurant() {
        System.out.println("Search restaurant for Premium delivery");
    }

    @Override
    public void scheduleDelivery(){
        IFoodDelivery.super.scheduleDelivery();
        System.out.println("Schedule delivery for Premium Delivery");
    }
}
