package OOPs.Polymorphism.RideBookingSystem;

// newly added vehicle type
public class Suv extends Vehicle{
    @Override
    public void doBooking(){
        System.out.println("SUV booking called...");
    }
}
