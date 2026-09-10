package CommandLinePractice;

public class EmployeeSalaryInfo {
    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Please enter employee details.");
            return;
        }

        int empId = Integer.parseInt(args[0]);
        String name = args[1];
        double basicSalary = Double.parseDouble(args[2]);
        double bonus = Double.parseDouble(args[3]);

        double grossSalary = basicSalary + bonus;
        double tax = grossSalary * 0.10;
        double netSalary = grossSalary - tax;

        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Tax         : " + tax);
        System.out.println("Net Salary  : " + netSalary);
    }
}
