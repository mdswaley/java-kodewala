package com.Interface.PaymentSystem;

class Main {
    public static void main(String[] args) {
        IPayment payment = new CreditCardPayment();

        payment.pay(7000);

        payment = new PayPalPayment();

        payment.pay(10000);
    }
}
