package OOPs.Encaptulation.ProductStockManagement;

public class Product {
    private String productName;
    private int quantity;

    public Product(String productName, int quantity){
        this.productName = productName;
        this.quantity = quantity;
    }

    public void addStock(int quantity){
        if (quantity > 0){
            this.quantity += quantity;
        }
    }

    public void sellProduct(int quantity){
        if (this.quantity < quantity){
            throw new RuntimeException("Insufficient Product for sell.");
        }

        if (quantity < 0){
            throw new RuntimeException("Invalid quantity");
        }

        this.quantity -= quantity;
    }

    public int getQuantity(){
        return quantity;
    }
}
