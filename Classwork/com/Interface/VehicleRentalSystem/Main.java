package com.Interface.VehicleRentalSystem;

public class Main {
    public static void main(String[] args) {
        IVehicle vehicle = new Car();
        Customer customer = new Customer(vehicle);

        int carRent = customer.calculateRent(3);
        System.out.println("Car rent: ₹" + carRent);

        IVehicle bike = new Bike();
        Customer customer2 = new Customer(bike);

        int bikeRent = customer2.calculateRent(2);
        System.out.println("Bike rent: ₹" + bikeRent);
    }
}
