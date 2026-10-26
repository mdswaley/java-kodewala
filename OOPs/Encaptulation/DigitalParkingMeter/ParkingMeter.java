package OOPs.Encaptulation.DigitalParkingMeter;

class ParkingMeter {
    private final String vehicleNumber;
    private int reminingMinutes;
    private final int INITIAL_MINUTES = 240;

    public ParkingMeter(String vehicleNumber, int reminingMinutes){
        this.vehicleNumber = vehicleNumber;
        this.reminingMinutes = reminingMinutes;
    }

    public void addParkingTime(int minutes){
        if (minutes > 0 && minutes + reminingMinutes <= INITIAL_MINUTES){
            reminingMinutes += minutes;
            System.out.println("Parking time added for vehicle Number : "+vehicleNumber);
        } else{
            System.out.println("Invalid time or maximum limit exceeded.");
        }
    }

    public void deductTime(int minutes){
        if (minutes > 0 && minutes <= reminingMinutes){
            reminingMinutes -= minutes;
        }
    }

    public int getReminingMinutes(){
        return reminingMinutes;
    }

    public String getVehicleNumber(){
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
