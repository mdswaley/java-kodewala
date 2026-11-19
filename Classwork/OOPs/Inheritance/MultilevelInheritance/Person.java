package OOPs.Inheritance.MultilevelInheritance;

class Person {

    void doSomethingInPerson(){
        System.out.println("Do something in person class");
    }
}

class Employee extends Person{
    void doSomethingInEmployee(){
        System.out.println("Do something in Employee class");
    }
}

class Manager extends Employee{
    void doSomethingInManger(){
        System.out.println("Do something in Manager class");
    }
}

class Main{
    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.doSomethingInPerson();
        manager.doSomethingInEmployee();
        manager.doSomethingInManger();
    }
}
