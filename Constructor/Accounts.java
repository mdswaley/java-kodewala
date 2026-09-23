package Constructor;

public class Accounts {
    int id;
    String name;
    double balance;

    Accounts(){
        System.out.println("Default constructor call...");
    }

    Accounts(int id, String name, double balance){
        System.out.println("Argument constructor call..");
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
}
