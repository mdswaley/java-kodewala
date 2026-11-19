package OOPs.Inheritance.Ecommers;

import java.security.PublicKey;

class Product {
    String productName;
    String description;
    int quantity;
    String status;

    Product(){}

    Product(String productName, String description, int quantity, String status){
        this.productName = productName;
        this.description = description;
        this.quantity = quantity;
        this.status = status;
    }

    public void viewProduct(){
        System.out.println(productName);
        System.out.println(description);
        System.out.println(quantity);
        System.out.println(status);
    }
}
