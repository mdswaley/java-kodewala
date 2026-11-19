package OOPs.Polymorphism.RideBookingSystem;

public class Bike extends Vehicle{
    @Override
    public void doBooking(){
        System.out.println("Bike booking called...");
    }
}
