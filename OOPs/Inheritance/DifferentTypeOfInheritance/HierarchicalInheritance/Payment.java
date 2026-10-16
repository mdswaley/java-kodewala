package OOPs.Inheritance.DifferentTypeOfInheritance.HierarchicalInheritance;

// hierarchical inheritance
class Payment {
    void validatePayment() {
        System.out.println("Validating payment...");
    }
}

class UpiPayment extends Payment {
    void payUsingUPI() {
        System.out.println("Payment completed using UPI");
    }
}

class CardPayment extends Payment {
    void payUsingCard() {
        System.out.println("Payment completed using card");
    }
}
