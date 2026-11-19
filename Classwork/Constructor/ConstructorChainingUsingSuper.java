package Constructor;

public class ConstructorChainingUsingSuper {
    public static void main(String[] args) {
        Car c1 = new Car("Audi", "A5", 5000000);

        System.out.println(c1);
    }
}

class Vehicle{
    String brand;

    Vehicle(String brand){
        this.brand = brand;
    }
}


class Car extends Vehicle{
    String model;
    double price;

    Car(String brand, String model, double price){
        super(brand);
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Car name : "+this.brand+" model : "+this.model+" price : "+this.price;
    }
}
