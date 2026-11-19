package OOPs.Encaptulation.EmployeeSalaryManagement;

import java.util.Arrays;
import java.util.List;

public class ImplementEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("Raaj", 0);
        Employee employee1 = new Employee("Priya", 0);

        List<Employee> arr = Arrays.asList(employee, employee1);

        try {
            employee.setEmployee_salary(70000);
            employee1.setEmployee_salary(-22);
        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

        for (Employee emp : arr){
            System.out.println("Employee Name : "+emp.getEmployee_name());
            System.out.println("Employee Salary : "+emp.getEmployee_salary());
        }


    }
}
