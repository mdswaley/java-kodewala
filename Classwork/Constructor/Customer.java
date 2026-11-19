package Constructor;

class Invoice{
    static String applicationName = "Amazon";

    int amount;
    String item;
    String billingAddress;
    String customerId;
    String customerName;

    Invoice(int amount,String item, String billingAddress, String customerId, String customerName){
        this.item = item;
        this.amount = amount;
        this.billingAddress = billingAddress;
        this. customerId = customerId;
        this.customerName = customerName;
    }

}


public class Customer {
    public static void main(String[] args) {
        System.out.println("Application Name : "+ Invoice.applicationName);

        Invoice inv1 = new Invoice(12000, "RED TAPE Shoes", "BTM Layout, Stage 1", "CUS001", "MD SWALEY");
        Invoice inv2 = new Invoice(4200, "Jeans for Men", "BTM Layout, Stage 1", "CUS002", "RAJESH");



    }
}
