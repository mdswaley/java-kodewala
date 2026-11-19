package com.Interface.VehicleRentalSystem;

public class Car implements IVehicle{
    @Override
    public int calculateRentCost(int hours) {
        return 200 * hours;
    }
}
