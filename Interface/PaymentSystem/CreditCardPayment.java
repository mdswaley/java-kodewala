package Interface.PaymentSystem;

public class CreditCardPayment implements IPayment{
    @Override
    public void pay(double amount) {
        System.out.println("Payment done using Credit Card.");
    }
}
