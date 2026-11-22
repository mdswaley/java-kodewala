package Payment_Gateway_System;

public class Main {
    public static void main(String[] args) {
        PaymentGateway gateway = new PaymentGateway();

        Payment payment1 = new CreditCardPayment();
        gateway.processPayment(payment1, 5000);

        Payment payment2 = new UPIPayment();
        gateway.processPayment(payment2, 2000);

        Payment payment3 = new NetBankingPayment();
        gateway.processPayment(payment3, 3000);
    }
}
