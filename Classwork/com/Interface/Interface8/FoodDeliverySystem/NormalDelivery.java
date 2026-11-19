package com.Interface.Interface8.FoodDeliverySystem;

class NormalDelivery implements IFoodDelivery{
    @Override
    public void placeOrder() {
        System.out.println("Order placed with normal delivery");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order is canceled");
    }

    @Override
    public void trackOrder() {
        System.out.println("Order is tracking");
    }

    @Override
    public void searchRestaurant() {
        System.out.println("Search restaurant");
    }
}
