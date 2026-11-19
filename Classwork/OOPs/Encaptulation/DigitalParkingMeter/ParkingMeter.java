package OOPs.Encaptulation.DigitalParkingMeter;

/**

 Represents a digital parking meter that manages the remaining
 parking time for a specific vehicle.
 The class demonstrates encapsulation by keeping its fields private
 and providing public methods to access and modify parking time.

 @author MD Swaley
 @version 1.0
 @since 2026-10-26
 */
class ParkingMeter {
    private final String vehicleNumber;
    private int reminingMinutes;
    private final int INITIAL_MINUTES = 240;

    /**
     * Constructs a ParkingMeter for the specified vehicle.
     *
     * @param vehicleNumber the registration number of the vehicle
     * @param reminingMinutes the initial remaining parking time in minutes
     */
    public ParkingMeter(String vehicleNumber, int reminingMinutes){
        this.vehicleNumber = vehicleNumber;
        this.reminingMinutes = reminingMinutes;
    }

    /**
     * Adds parking time if the requested duration is valid
     * and the total does not exceed the maximum allowed time.
     *
     * @param minutes the number of minutes to add
     */
    public void addParkingTime(int minutes){
        if (minutes > 0 && minutes + reminingMinutes <= INITIAL_MINUTES){
            reminingMinutes += minutes;
            System.out.println("Parking time added for vehicle Number : "+vehicleNumber);
        } else{
            System.out.println("Invalid time or maximum limit exceeded.");
        }
    }

    /**
     * Deducts parking time if the requested duration is valid
     * and does not exceed the remaining parking time.
     *
     * @param minutes the number of minutes to deduct
     */
    public void deductTime(int minutes){
        if (minutes > 0 && minutes <= reminingMinutes){
            reminingMinutes -= minutes;
        }
    }

    /**
     * Returns the remaining parking time.
     *
     * @return the remaining parking time in minutes
     */
    public int getReminingMinutes() {
        return reminingMinutes;
    }

/**
 * Returns the registration number of the vehicle.
 * @return the vehicle registration number
 */

    public String getVehicleNumber() {
        return vehicleNumber;
    }
}

class Main{
    public static void main(String[] args) {
        ParkingMeter parkingMeter = new ParkingMeter("MH AH OD 9697", 50);
        parkingMeter.addParkingTime(30);

        System.out.println("Remining Minutes : "+parkingMeter.getReminingMinutes());
        System.out.println("Vehicle Number : "+parkingMeter.getVehicleNumber());
    }
}
