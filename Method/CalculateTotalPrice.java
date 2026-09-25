package Method;

class Items{
    String itemName;
    double price;
    static double total;

    Items(String itemName, double price){
        this.itemName = itemName;
        this.price = price;
        total += this.price;
    }
}

public class CalculateTotalPrice {
    public static void main(String[] args) {
        Items i1 = new Items("TShirt", 530);
        Items i2 = new Items("Jeans", 1200);
        Items i3 = new Items("Shoes", 2000);


        System.out.println("Total price : "+Items.total);

    }

}
