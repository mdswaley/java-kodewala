package Payment_Gateway_System;

public class NetBankingPayment extends Payment{
    @Override
    void pay(int amount) {
        System.out.println("Processing NetBanking Payment...");
        System.out.println("Amount: " + amount);
        System.out.println("Payment successful using NetBanking!");
    }
}
