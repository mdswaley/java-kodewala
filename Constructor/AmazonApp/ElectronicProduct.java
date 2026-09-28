package Constructor.AmazonApp;

public class ElectronicProduct extends Product{
    int warranty;

    ElectronicProduct(String productId, String name, String category, int warranty){
        super(productId, name, category);
        this.warranty = warranty;
    }
}
