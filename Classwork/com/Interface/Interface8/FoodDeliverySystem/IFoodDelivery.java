package com.Interface.Interface8.FoodDeliverySystem;

interface IFoodDelivery {

//    by default every variable in interface in public static final
    int RES = 10;

    void placeOrder();
    void cancelOrder();
    void trackOrder();
    void searchRestaurant();

//    in future requirement to add scheduleDelivery() for only Premium Delivery
    default void scheduleDelivery(){
        System.out.println("IFood Delivery class default method...");
    }
}
