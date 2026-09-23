package Constructor;

public class Accounts { // if class is default type and constructor is public type then also we can't create object
    int id;
    String name;
    double balance;

    public Accounts(){ // if class access modifier is public and constructor is default then we can't call constructor outside.
        System.out.println("Default constructor call...");
    }

    public Accounts(int id, String name, double balance){
        System.out.println("Argument constructor call..");
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
}
