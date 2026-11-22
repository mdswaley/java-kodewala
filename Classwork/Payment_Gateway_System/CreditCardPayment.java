package Payment_Gateway_System;

public class CreditCardPayment extends Payment{
    @Override
    void pay(int amount) {
        System.out.println("Processing CreditCard Payment...");
        System.out.println("Amount: " + amount);
        System.out.println("Payment successful using CreditCard!");
    }
}
