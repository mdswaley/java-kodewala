package Constructor.AmazonApp;

public class OutfitProduct extends Product{
    int size;
    String color;

    OutfitProduct(String productId, String productName, String category, int size, String color) {
        super(productId, productName, category);
        this.size = size;
        this.color = color;
    }
}
