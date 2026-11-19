package Method.methodhiding;

public class Employee {
    public static void show(){
        System.out.println("Employee Details...");
    }
}

class Manager extends Employee{
    public static void show(){
        System.out.println("Manager Details...");
    }
}

class Main{
    public static void main(String[] args) {
        Manager.show();

//        here Employee and Manager both contain same method signature
//        but static method is not overriding it is method hiding
//        bcz static method works in compile time
//        and overriding happens only in runtime polymorphism

    }
}
