package Constructor;

public class ProductDetails {
    String name;
    double price;
    String desc;
    int quantity;

    ProductDetails(){
        System.out.println("Calling default constructor without any attributes");
    }

    ProductDetails(String name, double price, String desc, int quantity){
        this.name = name;
        this.price = price;
        this.desc = desc;
        this.quantity = quantity;
    }

    ProductDetails(String name, String desc){
        this.name = name;
        this.desc = desc;
    }

}
