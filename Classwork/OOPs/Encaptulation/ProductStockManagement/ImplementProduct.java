package OOPs.Encaptulation.ProductStockManagement;

public class ImplementProduct {
    public static void main(String[] args) {
        Product product = new Product("TShirt", 10);

        try {
            product.addStock(13);
            product.sellProduct(5);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("Current available product quantity : "+product.getQuantity());
    }
}
