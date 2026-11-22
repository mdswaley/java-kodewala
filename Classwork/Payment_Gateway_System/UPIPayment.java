package Payment_Gateway_System;

public class UPIPayment extends Payment{
    @Override
    void pay(int amount) {
        System.out.println("Processing UPI Payment...");
        System.out.println("Amount: " + amount);
        System.out.println("Payment successful using UPI!");
    }
}
