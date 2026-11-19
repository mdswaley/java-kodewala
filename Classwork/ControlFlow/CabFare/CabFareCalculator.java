package ControlFlow.CabFare;
/*

Develop a Cab Fare Module.

First 5 km → ₹15/km
Next 10 km → ₹12/km
Above 15 km → ₹10/km
If ride distance is more than 20 km, apply 10% discount.
Maximum discount = ₹200.

*/
public class CabFareCalculator {
    double fare;
    double dis;

    public double calculateFare(double range){

        if(range > 0 && range <= 5){

            fare = range * 15;

        }else if (range <= 15){

            fare = 5 * 15; // first 5km

            fare += (range - 5) * 12; // remaining distance

        }else {
            // First 5 km
            fare = 5 * 15;

            // Next 10 km
            fare += 10 * 12;

            // Distance above 15 km
            fare += (range - 15) * 10;

        }

        if (range > 20){
            dis = fare * 10 / 100;
        }

        if(dis > 200) dis = 200;

        fare -= dis;

        return fare;
    }
}
