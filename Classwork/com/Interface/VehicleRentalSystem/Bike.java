package com.Interface.VehicleRentalSystem;

public class Bike implements IVehicle{
    @Override
    public int calculateRentCost(int hours) {
        return 100 * hours;
    }
}
