package OOPs.Polymorphism.Upcasting;

class Ride {
    public void startRide() {
        System.out.println("Ride started");
    }

    public void calculateFare(double distance) {
        System.out.println("Calculating ride fare...");
    }
}

class BikeRide extends Ride{
    @Override
    public void startRide() {
        System.out.println("Bike ride started");
    }

    @Override
    public void calculateFare(double distance) {
        System.out.println("Bike fare: ₹" + (int)(distance * 10));
    }
}

class CarRide extends Ride{
    @Override
    public void startRide() {
        System.out.println("Car ride started");
    }

    @Override
    public void calculateFare(double distance) {
        System.out.println("Car fare: ₹" + (int)(distance * 30));
    }
}

class AutoRide extends Ride {

    @Override
    public void startRide() {
        System.out.println("Auto ride started");
    }

    @Override
    public void calculateFare(double distance) {
        System.out.println("Auto fare: ₹" + (int)(distance * 15));
    }
}

class Main{
    public static void main(String[] args) {
        Ride ride = new BikeRide();
        ride.startRide();
        ride.calculateFare(10);

        ride = new CarRide();
        ride.startRide();
        ride.calculateFare(10);

        ride = new AutoRide();
        ride.startRide();
        ride.calculateFare(10);
    }
}


