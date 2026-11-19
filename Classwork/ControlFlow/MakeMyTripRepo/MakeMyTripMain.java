package ControlFlow.MakeMyTripRepo;

public class MakeMyTripMain {
    public static void main(String[] args) {
        MakeMyTrip m1 = new MakeMyTrip();

        int fare = 6000;

        System.out.println("Total Fare: " + fare);

        double dis = m1.discount(fare);

        if(dis == 0){
            return;
        }

        double finalFare = fare - dis;


        System.out.println("Discount amount : " + dis);
        System.out.println("Final Fare: " + finalFare);

    }
}
