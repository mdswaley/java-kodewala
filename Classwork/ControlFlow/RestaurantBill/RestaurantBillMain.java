package ControlFlow.RestaurantBill;

public class RestaurantBillMain {
    public static void main(String[] args) {
        RestaurantBill r1 = new RestaurantBill();

        double bill = 2000;

        // Calculate discount
        double discount = r1.generateBill(bill);

        // Calculate amount after discount
        double amountAfterDiscount = bill - discount;

        // GST is calculated on the discounted amount
        double gst = amountAfterDiscount * 5 / 100;

        // Final amount
        double finalBill = amountAfterDiscount + gst;

        System.out.println("--------- Restaurant Billing System ---------");
        System.out.println("Bill                 : " + bill);
        System.out.println("Discount             : " + discount);
        System.out.println("Amount After Discount: " + amountAfterDiscount);
        System.out.println("GST (5%)             : " + gst);
        System.out.println("Final Bill           : " + finalBill);


    }
}
