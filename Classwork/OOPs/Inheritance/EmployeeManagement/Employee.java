package OOPs.Inheritance.EmployeeManagement;

class Employee {
    String name = "Swaley";
    String address = "Bangalore";

    private String empCode = "IC1234";

    public void markIn(String empId){
        System.out.println("Mark In : "+empId);
    }
}

class Manager extends Employee{
    public void doSomething(){
        System.out.println("Name of the employee : "+name);
        System.out.println("Address of the employee : "+address);
//        System.out.println(empCode); // cannot access bcz of private access modifier
        markIn("EMP423");
    }
}

class ImplementManager{
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.doSomething();
    }
}


