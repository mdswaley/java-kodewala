package Interface.PaymentSystem;

public class UpiPayment implements IPayment{
    @Override
    public void pay(double amount) {
        System.out.println("Payment done using UPI.");
    }
}
