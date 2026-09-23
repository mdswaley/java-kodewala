package Constructor;

public class UserProduct {
    public static void main(String[] args) {
        ProductDetails product1 = new ProductDetails();
        ProductDetails product2 = new ProductDetails("IPhone", 680000.34, "product of apple", 2);
        ProductDetails product3 = new ProductDetails("Water Bottle", "kinly brand");

        System.out.println("\nOrder Details1 : name : "+product2.name+" price : "
                +product2.price+" Description : "+product2.desc+" quantity: "+product2.quantity);

        System.out.println("\nOrder Details2 : name : "
                +product3.name+" Description : "+product3.desc);
    }
}
