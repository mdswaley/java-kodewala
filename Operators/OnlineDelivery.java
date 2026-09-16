package Operators;

public class OnlineDelivery {
    static String appName = "Zepto";

    String userName;
    int orderAmount;
    boolean primeUser;

    OnlineDelivery(String userName, int amount, boolean primeUser){
        this.userName = userName;
        this.orderAmount = amount;
        this.primeUser = primeUser;
    }


    public static void main(String[] args) {
        OnlineDelivery o1 = new OnlineDelivery("MD", 400, true);
        OnlineDelivery o2 = new OnlineDelivery("Swaley", 2150, true);
        OnlineDelivery o3 = new OnlineDelivery("Raj", 150, false);

        OnlineDelivery[] arr = {o1, o2, o3};

        for(OnlineDelivery o:arr){

            System.out.println("\nDetails of : "+o.userName);

            
            // Option 1
            if (o.orderAmount > 200 || o.primeUser) {
                System.out.println("Free Delivery from " + appName);
            } else {
                System.out.println("Delivery charge from " + appName);
            }

            double transactionCharge = o.orderAmount > 2000 ? o.orderAmount * 0.03 : 0;
            System.out.println("Transaction Charge: " + transactionCharge);
            System.out.println("Final Amount: " + (o.orderAmount + transactionCharge));

            // Option 2
            // if(o.orderAmount > 200 && o.primeUser){
            //     System.out.println("Free Delivary from "+appName+" and will deliver in one day.");

            // }else if(o.orderAmount > 200 && !o.primeUser){
            //     System.out.println("Free Delivary from "+appName);

            // }else if(o.orderAmount < 200 && o.primeUser){
            //     System.out.println("Delivary charge from "+appName+" but will deliver in one day.");

            // }else if(o.orderAmount < 200 && !o.primeUser){
            //     System.out.println("Delivary charge from "+appName);

            // }
        }
    }
}
