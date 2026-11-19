package com.Interface.VehicleRentalSystem;

public class Truck implements IVehicle{
    @Override
    public int calculateRentCost(int hours) {
        return 350 * hours;
    }
}
