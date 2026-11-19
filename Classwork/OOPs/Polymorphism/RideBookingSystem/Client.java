package OOPs.Polymorphism.RideBookingSystem;

public class Client {
    public static void main(String[] args) {
        ProcessVehicleRide processVehicleRide = new ProcessVehicleRide();
        Bike bike = new Bike();

        processVehicleRide.processRide(bike);

        Auto auto = new Auto();
        processVehicleRide.processRide(auto);


        processVehicleRide.processRide(new Suv()); // anonymous object

    }
}
