package OOPs.Inheritance.Ecommers;

class ClothingProduct extends Product{
    String color;
    String size;
    String brand;

    public ClothingProduct(String productName, String description, int quantity, String status, String color, String size, String brand) {
        super(productName, description, quantity, status);
        this.color = color;
        this.size = size;
        this.brand = brand;
    }

    public void viewClothingProduct(){
        System.out.println(productName);
        System.out.println(description);
        System.out.println(quantity);
        System.out.println(status);
        System.out.println(color);
        System.out.println(size);
        System.out.println(brand);
    }

}
