package OOPs.Inheritance.Ecommers;

class ElectronicProduct extends Product{
    boolean warranty;
    int warrantyInYear;

    public ElectronicProduct(String productName, String description, int quantity, String status, boolean warranty, int warrantyInYear) {
        super(productName, description, quantity, status);
        this.warranty = warranty;
        this.warrantyInYear = warrantyInYear;
    }

    public void viewElectronicProduct(){
        System.out.println(productName);
        System.out.println(description);
        System.out.println(quantity);
        System.out.println(status);
        System.out.println(warranty);
        System.out.println(warrantyInYear);
    }
}
