package ControlFlow.RestaurantBill;

public class RestaurantBill {
    double discount;

    public double generateBill(double bill){
        if (bill <= 1000){
            discount = 0;
            System.out.println("No discount...");
        }else if (bill > 1000 && bill <= 3000){
            discount = bill * 10 / 100;
        }else if (bill > 3000){
            discount = bill * 20 / 100;
        }else{
            System.out.println("Not a valid Booking...");
            return 0;
        }

        if (discount > 500){
            discount = 500;
        }

        return discount;
    }
}
