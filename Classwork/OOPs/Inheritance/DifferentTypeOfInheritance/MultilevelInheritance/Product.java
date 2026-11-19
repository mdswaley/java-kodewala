package OOPs.Inheritance.DifferentTypeOfInheritance.MultilevelInheritance;

// Multilevel inheritance
class Product {
    void displayProduct() {
        System.out.println("Product is available");
    }
}

class ElectronicProduct extends Product {
    void powerOn() {
        System.out.println("Electronic device is powered on");
    }
}

class Laptop extends ElectronicProduct {
    void runApplication() {
        System.out.println("Laptop is running an application");
    }
}
