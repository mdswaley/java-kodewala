package OOPs.Encaptulation;

public class ImplementPayment {
    public static void main(String[] args) {
        Payment payment = new Payment(1000);

        payment.setBalance(400);

        System.out.println("Credit the amount total available balance : "+payment.getBalance());

        System.out.println(payment.doDebit(300));

        System.out.println("debited the amount total available balance : "+payment.getBalance());

    }
}
