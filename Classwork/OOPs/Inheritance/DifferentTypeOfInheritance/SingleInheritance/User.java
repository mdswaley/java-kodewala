package OOPs.Inheritance.DifferentTypeOfInheritance.SingleInheritance;

// Single inheritance
class User {
    void userActivity(){
        System.out.println("User start activity");
    }
}

class Employee extends User{
    void userIsEmployee(){
        System.out.println("Employee start developing");
    }
}

