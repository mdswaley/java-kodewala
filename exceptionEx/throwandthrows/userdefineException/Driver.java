package exceptionEx.throwandthrows.userdefineException;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Start Main");

        PaymentMgmt paymentMgmt = new PaymentMgmt();

        try {
            paymentMgmt.doPayment("SBI-3453343", 200);
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("End Main");
    }
}
