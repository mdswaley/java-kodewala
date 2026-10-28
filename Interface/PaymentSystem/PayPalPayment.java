package Interface.PaymentSystem;

public class PayPalPayment implements IPayment{
    @Override
    public void pay(double amount) {
        System.out.println("Payment done using PayPal.");
    }
}
