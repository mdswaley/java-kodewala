package Payment_Gateway_System;

public class PaymentGateway {
    void processPayment(Payment payment, int amount){
        payment.pay(amount);
    }
}
