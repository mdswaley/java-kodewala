package OOPs.Polymorphism.RideBookingSystem;

public class ProcessVehicleRide {
    public void processRide(Vehicle vehicle){  // suppose we pass Bike object then here :- Vehicle vehicle = new Bike();
        vehicle.doBooking();
    }
}
