package OOPs.Polymorphism.Downcasting;

class Employee {
    void work(){
        System.out.println("Employee is working");
    }
}

class Developer extends Employee{
    void writeCode(){
        System.out.println("Developer is writing java code");
    }
}

class Main{
    public static void main(String[] args) {
        Employee employee = new Developer();

        employee.work();

        Developer developer = (Developer) employee; // down casting
//        means converting parent class reference to child class reference is known as down - casting

        developer.writeCode();
    }
}
