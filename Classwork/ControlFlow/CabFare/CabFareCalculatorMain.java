package ControlFlow.CabFare;

public class CabFareCalculatorMain {
    public static void main(String[] args) {
        CabFareCalculator c1 = new CabFareCalculator();

        double range = 18;
        double fare = c1.calculateFare(range);

        System.out.println("------------Cab Fare Calculator-----------");
        System.out.println("Distance : "+range+"/km");
        System.out.println("Total : ₹"+fare);
    }
}
