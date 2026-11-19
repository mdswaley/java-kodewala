package OOPs.Polymorphism;

class Employee {
    public void markIn(){
        System.out.println("Employee.markIn().....Employee mark in");
    }
}

class Manager extends Employee{
    @Override
    public void markIn(){
        System.out.println("Manager.markIn().....Manager mark in");
    }
}

class Main{
    public static void main(String[] args) {
        Employee employee = new Manager(); // every object create at the run time.

        employee.markIn(); // same method will behave differently based on actual object
//        1. at the compilation, it will check the method's exist in class Employee
//        2. at the time of execution(while running), it will call the method on actual object
    }
}