package CommandLinePractice;

public class ShoppingCart {
    public static void main(String[] args) {
        if(args.length < 4){
            System.out.println("Please enter all details");
            return;
        }

        String productName = args[0];
        int quantity = Integer.parseInt(args[1]);
        double price = Double.parseDouble(args[2]);
        double discount = Double.parseDouble(args[3]);

        double subTotal = price * quantity;
        double finalAmt = subTotal - discount;

        System.out.println("Product name : "+productName);
        System.out.println("Quantity : "+quantity);
        System.out.println("Price : "+price);
        System.out.println("Subtotal : "+subTotal);
        System.out.println("Discount : "+discount);
        System.out.println("Final : "+finalAmt);
    }
}
/*  
output
PS C:\Users\mdswa\Desktop\KodeWala(Java)> java CommandLinePractice.ShoppingCart Jeans 4 500 200 
Product name : Jeans
Quantity : 4
Price : 500.0
Subtotal : 2000.0
Discount : 200.0
Final : 1800.0
PS C:\Users\mdswa\Desktop\KodeWala(Java)> 


 */