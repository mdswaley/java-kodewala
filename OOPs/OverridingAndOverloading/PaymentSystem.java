package OOPs.OverridingAndOverloading;

class PaymentSystem {
    void pay(double amount){
        System.out.println("Amount paid successfully.");
    }

    void pay(double amount, String couponCode){
        System.out.println("Amount paid with apply coupon code.");
    }
}

class UPIPayment extends PaymentSystem{
    @Override
    void pay(double amount, String couponCode){
        System.out.println("Amount paid through UPI with apply coupon code");
    }
}

class ImplementPayment{
    public static void main(String[] args) {
        PaymentSystem paymentSystem = new UPIPayment();
        paymentSystem.pay(2000.00, "XYZ3221");
        paymentSystem.pay(7000.00);
    }
}
