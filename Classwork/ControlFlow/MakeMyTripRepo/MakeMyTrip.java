package ControlFlow.MakeMyTripRepo;

/**
 * MakeMyTrip Discount Module
 *
 * Calculates the discount based on the total fare.
 */
public class MakeMyTrip {

    public double discount(double budget){

        double dis = 0;

        if(budget > 0 && budget < 5000){

            dis = 0;
            System.out.println("No discount..");

        }else if (budget >= 5000 && budget <= 10000){

            dis = budget * 10 / 100;
            System.out.println("Discount is : 10% ");

        } else if (budget > 10000) {

            dis = budget * 15 / 100;
            System.out.println("Discount is : 15% ");

        }else{
            System.out.println("not a valid input...");
            return 0;
        }

    // maximize the discount
        if (dis > 1250){
            dis = 1250;
        }

        return dis;
    }
}
