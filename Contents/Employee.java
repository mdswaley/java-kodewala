package Contents;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
class Manager {
    void increaseSalary(Employee employee, double amount) {
        if (amount > 0 && amount <= employee.salary / 2) {
            employee.salary += amount;

            System.out.println(employee.name + ", your salary has increased successfully.🥳");
            System.out.println("Updated salary: " + employee.salary);
        } else {
            System.out.println("Invalid salary increment amount.");
        }
    }
}
class Main{
    public static void main(String[] args) {
        Employee employee = new Employee("MD", 50000);

        Manager manager = new Manager();
        manager.increaseSalary(employee,10000);
    }
}
