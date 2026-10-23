package OOPs.Polymorphism.RideBookingSystem;

public class Auto extends Vehicle{
    @Override
    public void doBooking(){
        System.out.println("Auto booking called...");
    }
}
