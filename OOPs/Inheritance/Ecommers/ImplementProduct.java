package OOPs.Inheritance.Ecommers;

public class ImplementProduct {
    public static void main(String[] args) {
        ElectronicProduct product = new ElectronicProduct("TV", "Smart TV", 6,
                "Available", true, 2);

        ClothingProduct product1 = new ClothingProduct("TShirt", "TShirt for men", 10,
                "Available", "Black", "L", "Killer");

        System.out.println("View Electronic Product");
        product.viewElectronicProduct();

        System.out.println();

        System.out.println("View Clothing Product");
        product1.viewClothingProduct();

    }
}
