package OOPs.Encaptulation.EmployeeSalaryManagement;

public class Employee {
    private final String employee_name;
    private double employee_salary;

    public Employee(String employee_name, double employee_salary){
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
    }

    public void setEmployee_salary(double amount){
        if (amount > 0){
            this.employee_salary += amount;
        }else {
            throw new IllegalArgumentException("Invalid amount");
        }
    }

    public String getEmployee_name(){
        return employee_name;
    }

    public double getEmployee_salary(){
        return employee_salary;
    }
}
