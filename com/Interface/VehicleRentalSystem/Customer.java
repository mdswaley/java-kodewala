package com.Interface.VehicleRentalSystem;

public class Customer {
    private final IVehicle iVehicle;

    Customer(IVehicle vehicle){
        this.iVehicle = vehicle;
    }

    public int calculateRent(int hours){
        return iVehicle.calculateRentCost(hours);
    }
}
